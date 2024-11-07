/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeRevisao0307;

import java.util.Scanner;

/**
 *
 * @author 12968505602
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        
        Aluno aln = new Aluno();
        Professor pro = new Professor();
        Turma tur = new Turma();
        Notas not = new Notas();
        
        Disciplina int1 = new Disciplina(aln, pro, tur, not);
        
        System.out.println("Digite o nome do aluno ");
        aln.setNomeA(entrada.nextLine());
        System.out.println("Digite a mátricula do aluno: ");
        aln.setCadastroA(entrada2.nextInt());
        System.out.println("_____________________________");
        
        System.out.println(" ");
        System.out.println("-----Cadastro do professor-----  ");
        System.out.println("Digite o nome do professor: ");
        pro.setNomeP(entrada.nextLine());
        System.out.println("Digite o cadastro do professor: ");
        pro.setCadastroP(entrada2.nextInt());
        System.out.println("_____________________________");
        
        System.out.println(" ");
        System.out.println("-----Informações da turma----- ");
        System.out.println("Digite a turma: ");
        tur.setNomeT(entrada.nextLine());
        System.out.println("Digite a quantidade de alunos na turma: ");
        tur.setQuant_alun(entrada2.nextInt());
        System.out.println("Digite a disciplina: ");
        int1.setNomeD(entrada.nextLine());
        System.out.println("Digite a quantidade de disciplina: ");
        int1.setQuant_displ(entrada2.nextInt());
        System.out.println("_____________________________");
        
        System.out.println(" ");
        System.out.println("-----Sistema de Provas:----- ");
        System.out.println("Digite a nota da prova 1: ");
        not.setNota1(entrada3.nextDouble());        
        System.out.println("Digite a nota da prova 2: ");
        not.setNota2(entrada3.nextDouble());       
        System.out.println("Digite a nota da prova 3: ");
        not.setNota3(entrada3.nextDouble());
        
        System.out.println("_____________________________");
        int1.visualizadorDisciplina();
        
    }
    
}
