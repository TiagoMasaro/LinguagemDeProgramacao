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
public class VerificacaoIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int idade = entrada.nextInt();
        
        if(idade>=18)
        {
            System.out.println("Você é maior de idade");
    }
        else 
        {
            System.out.println("Você é menor de idade");
        }
}
}
