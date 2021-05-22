/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsp.compiladores.analizadores;

/**
 *
 * @author MARTIN
 */

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;


public class Principal {
    public static void main(String[] args){
        try {            
            CharStream cs = CharStreams.fromFileName(args[0]);
            System.out.println("-------------- INICIO --------------");
            mini0lexerLexer lexer = new mini0lexerLexer(cs);
            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            mini0lexerParser parser = new mini0lexerParser(tokens);
            //parser.program();
            Token t = null;
            while((t = lexer.nextToken()).getType() != Token.EOF){
                System.out.println("["+t.getType()+"," +t.getText()+"]");
            
            }
            
            
        } catch (IOException ex) {
        }
        System.out.println("-------------- FIN --------------");
    }
}
