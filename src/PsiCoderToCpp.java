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
        this.write("cout ");
        for(int i = 0; i < ctx.expresion().size(); i++){
            this.write(" << ");
            visitExpresion(ctx.expresion(i));
        }
        this.write(";\n");
        return null;
    }

    @Override
    public T visitExpresion(PsiCoderParser.ExpresionContext ctx) {
        this.write(ctx.getText());
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
