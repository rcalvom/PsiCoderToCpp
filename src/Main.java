import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static final String input = "input/input.pc";
    private static final String output = "output/output.cpp";

    public static void main(String[] args) {
        System.out.println("Traductor de lenguaje Psicoder a C++.\n");
        try {
            CommonTokenStream tokens = new CommonTokenStream(new PsiCoderLexer(CharStreams.fromFileName(input)));
            System.out.println("Se ha encontrado el archivo de entrada en la ruta: " + input);
            PsiCoderParser parser = new PsiCoderParser(tokens);
            ParseTree tree = parser.s();
            ParseTreeWalker walker = new ParseTreeWalker();
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            walker.walk(new PsiCoderToCpp(writer), tree);
            System.out.println("La traducción ha terminado satisfactiamente, los resultados están en la ruta: " + output + "\n");
            writer.close();
        }catch (IOException ioException){
            System.out.println("No se ha encontrado el archivo de entrada en la ruta: " + input + ", por favor revise que el archivo exista.");
            System.exit(-1);
        }

    }
}

