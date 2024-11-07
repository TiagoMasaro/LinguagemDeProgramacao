/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade0702;

import java.util.Scanner;

/**
 *
 * @author 12968505602
 */
public class TabuadaInterativa {
    public static void main(String[] args) {
     
     Scanner entrada = new Scanner(System.in);
     int i=0;
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        
        while(i<=10)
        {
            int multipli=i*num;
            System.out.println(num+ "*"+i+" = "+multipli);
            i=i+1;
        }
}
}