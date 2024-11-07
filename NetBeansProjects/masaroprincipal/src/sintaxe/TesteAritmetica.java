/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;

/**
 *
 * @author 12968505602
 */
public class TesteAritmetica {
    public static void main(String[] args) {
       
    Aritmetica x = new Aritmetica();
        
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Digite um número inteiro: ");
            double num_1 = entrada.nextInt();
            
            System.out.println("Digite um número inteiro: ");
            double num_2 = entrada.nextInt();
            
           System.out.println("A soma dos números é: "+x.soma(num_1,num_2));
           System.out.println("A subtração dos números é: "+x.subtracao(num_1,num_2));
           System.out.println("A multiplicação dos números é: "+x.multiplicacao(num_1,num_2));
           System.out.println("A divisão dos números é: "+x.divisao(num_1,num_2));
           System.out.println("O resto dos números é: "+x.resto(num_1,num_2));
}
}
