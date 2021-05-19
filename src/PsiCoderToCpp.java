import java.io.BufferedWriter;
import java.io.IOException;

public class PsiCoderToCpp extends PsiCoderBaseListener {

    private final BufferedWriter writer;
    private int tabs;

    public PsiCoderToCpp(BufferedWriter writer){
        super();
        this.writer = writer;
        this.tabs = 0;
        try {
            this.writer.write("#include <iostream>\n" +
                    "#include <string>\n\n" +
                    "using namespace std;\n" +
                    "\n");
        }catch(IOException e){
            System.out.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }
    }

    @Override
    public void enterPrincipal(PsiCoderParser.PrincipalContext ctx) {
        try {
            this.writer.write("int main(){\n");
            this.tabs++;
        }catch(IOException e){
            System.out.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }
    }

    @Override
    public void exitPrincipal(PsiCoderParser.PrincipalContext ctx) {
        try{
            this.writer.write("\t".repeat(this.tabs));
            this.writer.write("return 0;\n");
            this.tabs--;
            this.writer.write("\t".repeat(this.tabs));
            this.writer.write("}\n\n");
        }catch(IOException e){
            System.out.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }

    }

    @Override
    public void enterImprimir(PsiCoderParser.ImprimirContext ctx) {
        try{
            this.writer.write("\t".repeat(this.tabs));
            this.writer.write("cout ");
        }catch(IOException e){
            System.out.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }
    }


    @Override
    public void exitImprimir(PsiCoderParser.ImprimirContext ctx) {
        try{
            this.writer.write(";\n");
        }catch(IOException e){
            System.out.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }
    }

    @Override
    public void enterParam_imprimir(PsiCoderParser.Param_imprimirContext ctx) {
        try{
            this.writer.write("<< ");
        }catch(IOException e){
            System.out.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }
    }
    @Override
    public void exitParam_imprimir(PsiCoderParser.Param_imprimirContext ctx) {
        try{
            this.writer.write(" ");
        }catch(IOException e){
            System.out.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }
    }

    @Override
    public void enterId(PsiCoderParser.IdContext ctx) {
        try{
            this.writer.write(ctx.ID(0).getText());
            for(int i = 1; i < ctx.ID().size(); i++){
                this.writer.write("." + ctx.ID(i).getText());
            }
        }catch(IOException e){
            System.out.println("Ha ocurrido un error escribiendo el archivo de salida.");
            System.exit(-1);
        }
    }



}
