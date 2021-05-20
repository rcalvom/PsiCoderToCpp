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
        return super.visitS(ctx);
    }

    @Override
    public T visitPrincipal(PsiCoderParser.PrincipalContext ctx) {
        this.write("int main(){\n");
        this.tabs++;
        for(int i = 0; i < ctx.sentencia().size(); i++){
            visitSentencia(ctx.sentencia(i));
        }
        this.write("\n");
        this.write("\t".repeat(this.tabs));
        this.write("return 0;\n");
        this.tabs--;
        this.write("\t".repeat(this.tabs));
        this.write("}\n");
        return null;
    }

    @Override
    public T visitSentencia(PsiCoderParser.SentenciaContext ctx) {
        visitImprimir(ctx.imprimir());
        return null;
    }

    @Override
    public T visitImprimir(PsiCoderParser.ImprimirContext ctx) {
        this.write("\t".repeat(this.tabs));
        this.write("cout");
        for(int i = 0; i < ctx.expresion().size(); i++){
            this.write(" << ");
            visitExpresion(ctx.expresion(i));
        }
        this.write(";\n");
        return null;
    }

    @Override
    public T visitExpresion(PsiCoderParser.ExpresionContext ctx) {
        if(ctx.ENTERO() != null){
            this.write(ctx.ENTERO().getText());
        }else if(ctx.REAL() != null){
            String s = ctx.REAL().getText();
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

    private void write(String s){
        try{
            this.writer.write(s);
        }catch (IOException e){
            System.err.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }
    }




}
