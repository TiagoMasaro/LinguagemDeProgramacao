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
public class VerificacaoNumerosPares {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int x=0;
        
        while(x<=100)
        {
            if(x % 2 == 0)
            {
                System.out.println(x);
            }
            x=x+1;
        }
    }
}
