/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 12968505602
 */
public class TesteException {
    public static void main(String[] args) {
        try{
        abrirArquivo();
            System.out.println("Arquivo encontrado com sucesso! ");
    }catch (FileNotFoundException ex){
            System.out.println("Erro ao abrir o arquivo "+ ex.getMessage());
    }
    }
    public static void abrirArquivo() throws FileNotFoundException {
    Scanner entrada = null;
    entrada = new Scanner(new File("d://texto.txt"));
    
    while (entrada.hasNextLine()){
        System.out.println(entrada.nextLine() );
    }
    }

}
