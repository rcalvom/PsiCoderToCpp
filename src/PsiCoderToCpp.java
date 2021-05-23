import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;

public class PsiCoderToCpp<T> extends PsiCoderBaseVisitor<T>{

    private final BufferedWriter writer;
    private int tabs;

    public PsiCoderToCpp(BufferedWriter writer){
        super();
        this.writer = writer;
        this.tabs = 0;
        this.write("#include <iostream>\n" +
                "#include <string>\n\n" +
                "using namespace std;\n" +
                "\n");
    }

    @Override
    public T visitS(PsiCoderParser.SContext ctx) {
        int function = 0, struct = 0, index = 0;
        while(!(ctx.getChild(index) instanceof PsiCoderParser.PrincipalContext)){
            if(ctx.getChild(index) instanceof PsiCoderParser.FuncionContext){
                visitFuncion(ctx.funcion(function++));
            }else if(ctx.getChild(index) instanceof PsiCoderParser.EstructuraContext){
                visitEstructura(ctx.estructura(struct++));
            }
            index++;
        }
        visitPrincipal(ctx.principal());
        while(!(ctx.getChild(index) instanceof TerminalNode)){
            if(ctx.getChild(index) instanceof PsiCoderParser.FuncionContext){
                visitFuncion(ctx.funcion(function++));
            }else if(ctx.getChild(index) instanceof PsiCoderParser.EstructuraContext){
                visitEstructura(ctx.estructura(struct++));
            }
            index++;
        }
        return null;
    }

    @Override
    public T visitFuncion(PsiCoderParser.FuncionContext ctx) {
        this.write("\t".repeat(this.tabs));
        visitTipo(ctx.tipo());
        this.write(" " + ctx.ID().getText());
        this.write("(");
        visitParam_funcion(ctx.param_funcion());
        this.write(")");
        this.write(" {\n");
        this.tabs++;
        for(int i = 0; i < ctx.sentencia().size(); i++){
            this.write("\t".repeat(this.tabs));
            visitSentencia(ctx.sentencia(i));
            this.write("\n");
        }
        this.tabs--;
        this.write("}\n\n");
        return null;
    }

    @Override
    public T visitParam_funcion(PsiCoderParser.Param_funcionContext ctx) {
        if(ctx.tipo() == null || ctx.tipo().size() == 0){
            return null;
        }else{
            visitTipo(ctx.tipo(0));
            this.write(" " + ctx.ID(0));
            for(int i = 1; i < ctx.tipo().size(); i++){
                this.write(", ");
                visitTipo(ctx.tipo(i));
                this.write(" " + ctx.ID(i));
            }
        }
        return null;
    }

    @Override
    public T visitEstructura(PsiCoderParser.EstructuraContext ctx) {
        this.write("struct ");
        this.write(ctx.ID().getText() + " {\n");
        this.tabs++;
        for(int i = 0; i < ctx.sentencia_estructura().size(); i++){
            this.write("\t".repeat(this.tabs));
            visitSentencia_estructura(ctx.sentencia_estructura(i));
            this.write("\n");
        }
        this.tabs--;
        this.write("};\n\n");
        return null;
    }

    @Override
    public T visitSentencia_estructura(PsiCoderParser.Sentencia_estructuraContext ctx) {
        visitTipo(ctx.tipo());
        this.write(" " + ctx.ID(0).getText());
        for(int i = 1; i < ctx.ID().size(); i++){
            this.write(", " + ctx.ID(i).getText());
        }
        this.write(";");
        return null;
    }

    @Override
    public T visitPrincipal(PsiCoderParser.PrincipalContext ctx) {
        this.write("\t".repeat(this.tabs));
        this.write("int main(){\n");
        this.tabs++;
        for(int i = 0; i < ctx.sentencia().size(); i++){
            this.write("\t".repeat(this.tabs));
            visitSentencia(ctx.sentencia(i));
            this.write("\n");
        }
        this.write("\t".repeat(this.tabs));
        this.write("return 0;\n");
        this.tabs--;
        this.write("\t".repeat(this.tabs));
        this.write("}\n\n");
        return null;
    }

    @Override
    public T visitSentencia(PsiCoderParser.SentenciaContext ctx) {
        if(ctx.imprimir()!= null) {
            visitImprimir(ctx.imprimir());
        }else if(ctx.si()!= null){
            visitSi(ctx.si());
        }else if(ctx.seleccionar()!= null){
            visitSeleccionar(ctx.seleccionar());
        }else if(ctx.romper()!= null){
            visitRomper(ctx.romper());
        }else if(ctx.para()!= null){
            visitPara(ctx.para());
        }else if(ctx.hacer()!= null){
            visitHacer(ctx.hacer());
        }else if(ctx.mientras()!= null){
            visitMientras(ctx.mientras());
        }else if(ctx.leer()!= null){
            visitLeer(ctx.leer());
        }else if(ctx.retorno()!= null){
            visitRetorno(ctx.retorno());
        }else if(ctx.tipo()!= null){
            visitTipo(ctx.tipo());
            this.write(" ");
            for (int i = 0; i < ctx.id().size(); i++) {
                visitId(ctx.id(i));
                this.write(", ");
            }
        }else if(ctx.id()!= null){
            this.write(ctx.getText());
        }
        return null;
    }

    @Override
    public T visitImprimir(PsiCoderParser.ImprimirContext ctx) {
        this.write("cout");
        for(int i = 0; i < ctx.expresion().size(); i++){
            this.write(" << ");
            visitExpresion(ctx.expresion(i));
        }
        this.write(";");

        return null;
    }

    @Override
    public T visitExpresion(PsiCoderParser.ExpresionContext ctx) {
        if(ctx.ENTERO() != null){
            this.write(ctx.ENTERO().getText());
        }else if(ctx.REAL() != null){
            this.write(ctx.REAL().getText());
        }else if(ctx.BOOLEANO() != null){
            if(ctx.BOOLEANO().getText().equals("verdadero")){
                this.write("true");
            }else if(ctx.BOOLEANO().getText().equals("falso")){
                this.write("false");
            }
        }else if(ctx.CADENA() != null){
            this.write(ctx.CADENA().getText());
        }else if(ctx.CARACTER() != null){
            this.write(ctx.CARACTER().getText());
        }else if(ctx.id() != null){
            this.write(ctx.id().getText());
        }else if(ctx.llamado_funcion() != null){
            visitLlamado_funcion(ctx.llamado_funcion());
        }else if(ctx.getText().charAt(0) == '('){
            this.write("(");
            visitExpresion(ctx.expresion(0));
            this.write(")");
        }else if(ctx.operador_binario() != null){
            visitExpresion(ctx.expresion(0));
            this.write(" " + ctx.operador_binario().getText() + " ");
            visitExpresion(ctx.expresion(1));
        }else if(ctx.operador_unitario() != null){
            this.write(ctx.operador_unitario().getText());
            visitExpresion(ctx.expresion(0));
        }
        return null;
    }

    @Override
    public T visitTipo(PsiCoderParser.TipoContext ctx) {
        if(ctx.id() != null){
            visitId(ctx.id());
        }else{
            String type = ctx.getText();
            switch (type) {
                case "entero" -> this.write("int");
                case "booleano" -> this.write("bool");
                case "caracter" -> this.write("char");
                case "real" -> this.write("double");
                case "cadena" -> this.write("string");
            }
        }
        return null;
    }

    @Override public T visitSi(PsiCoderParser.SiContext ctx) {
        this.write("if (");
        visitExpresion(ctx.expresion());
        this.write("){");
        this.write("\n");
        this.write("\t".repeat(++this.tabs));
        for(int i = 0; i < ctx.sentencia().size(); i++){
            visitSentencia(ctx.sentencia(i));
            this.write("\n");
        }
        this.tabs--;
        this.write("\t".repeat(this.tabs));
        this.write("}");
        if(ctx.si_no()!= null && ctx.getText().contains("si_no")){
            visitSi_no(ctx.si_no());
        }
        return null;
    }

    @Override public T visitSi_no(PsiCoderParser.Si_noContext ctx) {
        this.write(" else {");
        this.write("\n");
        this.tabs++;
        for(int i = 0; i < ctx.sentencia().size(); i++){
            this.write("\t".repeat(this.tabs));
            visitSentencia(ctx.sentencia(i));
            this.write("\n");
        }
        this.tabs--;
        this.write("\t".repeat(this.tabs));
        this.write("}");
        return null;
    }

    @Override public T visitSeleccionar(PsiCoderParser.SeleccionarContext ctx) {
        this.write("switch (");
        visitExpresion(ctx.expresion());
        this.write("){");
        this.write("\n");
        this.tabs++;
        for(int i = 0; i < ctx.caso().size(); i++){
            this.write("\t".repeat(this.tabs));
            visitCaso(ctx.caso(i));
        }
        this.tabs--;
        this.write("\t".repeat(this.tabs));
        this.write("}");
        return null;
    }
    @Override public T visitCaso(PsiCoderParser.CasoContext ctx) {
        if(ctx.getText().contains("caso")){
            this.write("case ");
            visitExpresion(ctx.expresion());
            this.write(":");
            this.write("\n");
            this.tabs++;
            for(int i = 0; i < ctx.sentencia().size(); i++){
                this.write("\t".repeat(this.tabs));
                visitSentencia(ctx.sentencia(i));
                this.write("\n");
            }
            this.tabs--;
        }else{
            this.write("default : ");
            this.write("\n");
            this.tabs++;
            for(int i = 0; i < ctx.sentencia().size(); i++){
                this.write("\t".repeat(this.tabs));
                visitSentencia(ctx.sentencia(i));
                this.write("\n");
            }
            this.tabs--;
        }
        return null;
    }
    @Override public T visitPara(PsiCoderParser.ParaContext ctx) {
        this.write("for (");
        if(ctx.tipo()!= null) {
            visitTipo(ctx.tipo());
        }
        this.write(" ");
        visitId(ctx.id());
        this.write(" = ");
        visitExpresion(ctx.expresion(0));
        this.write("; ");
        visitExpresion(ctx.expresion(1));
        this.write("; ");
        visitExpresion(ctx.expresion(2));
        this.write(") {");
        this.write("\n");
        this.tabs++;
        for(int i = 0; i < ctx.sentencia().size(); i++){
            this.write("\t".repeat(this.tabs));
            visitSentencia(ctx.sentencia(i));
            this.write("\n");
        }
        this.tabs--;
        this.write("\t".repeat(this.tabs));
        this.write("}");
        return null;
    }
    @Override public T visitHacer(PsiCoderParser.HacerContext ctx) {

        this.write("do {");
        this.write("\n");
        this.tabs++;
        for(int i = 0; i < ctx.sentencia().size(); i++){
            this.write("\t".repeat(this.tabs));
            visitSentencia(ctx.sentencia(i));
            this.write("\n");
        }
        this.tabs--;
        this.write("\t".repeat(this.tabs));
        this.write("} while (");
        visitExpresion(ctx.expresion());
        this.write(");");

        return null;
    }

    @Override public T visitRomper(PsiCoderParser.RomperContext ctx) {
        this.write("break;");
        return null;
    }

    @Override public T visitMientras(PsiCoderParser.MientrasContext ctx) {
        this.write("while (");
        visitExpresion(ctx.expresion());
        this.write("){");
        this.write("\n");
        this.tabs++;
        for(int i = 0; i < ctx.sentencia().size(); i++){
            this.write("\t".repeat(this.tabs));
            visitSentencia(ctx.sentencia(i));
            this.write("\n");
        }
        this.tabs--;
        this.write("\t".repeat(this.tabs));
        this.write("}");

        return null;
    }

    @Override public T visitLeer(PsiCoderParser.LeerContext ctx) {
        this.write("cin >> ");
        visitId(ctx.id());
        this.write(";");
        return null;
    }

    @Override public T visitId(PsiCoderParser.IdContext ctx) {
        this.write(ctx.getText());
        return null;
    }

    @Override public T visitRetorno(PsiCoderParser.RetornoContext ctx) {
        this.write("return ");
        visitExpresion(ctx.expresion());
        this.write(";");
        return null;
    }


    private void write(String s){
        try{
            this.writer.write(s);
        }catch (IOException e){
            System.err.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }
    }

}
