import domains.Lox;

import java.io.IOException;

public class RunLox {

    public static void main(String[] args) throws IOException {

        if(args.length > 1){
            System.out.println("Usage: jlox [script]");
            System.exit(64);
        } else if (args.length == 1) {
            Lox.runFile(args[0]);
        }else{
            Lox.runPrompt();
        }

    }
}
