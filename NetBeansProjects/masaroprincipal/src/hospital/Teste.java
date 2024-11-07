/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author 12968505602
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Paciente pac = new Paciente();
        Medico med = new Medico();
        Enfermeiro enf = new Enfermeiro();
        
        Internacao int1 = new Internacao(pac, med, enf);
        
        System.out.println("Digite o nome do paciente: ");
        pac.setNomeP(entrada.nextLine());
        
        System.out.println("Digite o nome do médico: ");
        med.setNomeM(entrada.nextLine());
        
        System.out.println("Digite o nome do enfermeiro: ");
        enf.setNomeE(entrada.nextLine());
        
        System.out.println("Digite o ID: ");
        int1.setId_internacao(entrada.nextLine());
        
        System.out.println("Digite o motivo da internação: ");
        int1.setMotivoInternacao(entrada.nextLine());
        
        System.out.println("Valor do dia da internação: ");
        int1.setValorDiaInternacao(entrada.nextDouble());
        
        System.out.println("Digite a quantidade de dias: ");
        int1.setQuantDiaInternacao(entrada.nextInt());
        
        int1.getValorTotalInternacao();
        System.out.println("__________________________");
        int1.visualizarInternacao();
        
        
        
    }
}
