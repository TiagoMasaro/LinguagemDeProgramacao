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
public class MediaNotas {
     public static void main(String[] args) {
         
         Scanner entrada = new Scanner(System.in);
         System.out.println("Insira a quantidade de alunos: ");
         int quant_alun = entrada.nextInt();
         
         double notas[] = new double[quant_alun];
         double soma=0;
         
         for(int x=0;x<quant_alun;x++)
         {
             System.out.println("Digite a nota do aluno "+(x+1));
             notas[x] = entrada.nextInt();
             soma=soma+notas[x];
         }
         double media = soma/quant_alun;
         System.out.println("A média das notas é: "+media);
     
}
}
