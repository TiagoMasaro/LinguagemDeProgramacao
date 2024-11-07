/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author 12968505602
 */
public class TestePorta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Porta porta1 = new Porta();
        porta1.abre();
        porta1.fecha();
        System.out.println("Digite a cor da porta: ");
        String cor = entrada.nextLine();
        porta1.pinta(cor);
        System.out.println("Cor da porta: "+porta1.getCor());
        System.out.println("Porta aberta: "+(porta1.estaAberta()== true? "Sim":"Não"));
    }
           
                    
}
