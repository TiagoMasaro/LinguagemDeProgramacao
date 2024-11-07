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
public class VerificacaoNumeros {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite um número inteiro: ");
        int num2 = entrada.nextInt();
        System.out.println("Digite um número inteiro: ");
        int num3 = entrada.nextInt();
    
    if((num1 > num2) && (num1 > num3))
    {
        System.out.println("O número "+num1+" é maior");
    }
    else if((num2 > num1) && (num2 > num3))
    {
        System.out.println("O número "+num2+" é maior");
    }
    else
    {
        System.out.println("O número "+num3+" é maior");
    }
    
    if(num1>0)
    {
        System.out.println("O número "+num1+" é positivo");
    }
    else if(num1<0)
    {
        System.out.println("O número "+num1+" é negativo");
    }
    else{
        System.out.println("O número "+num1+" é nulo");
              
    }
    if(num2>0)
    {
        System.out.println("O número "+num2+" é positivo");
    }
    else if(num2<0)
    {
        System.out.println("O número "+num2+" é negativo");
    }
    else{
        System.out.println("O número "+num2+" é nulo");
              
    }
    if(num3>0)
    {
        System.out.println("O número "+num3+" é positivo");
    }
    else if(num3<0)
    {
        System.out.println("O número "+num3+" é negativo");
    }
    else{
        System.out.println("O número "+num3+" é nulo");
              
    }
    }
    
}
