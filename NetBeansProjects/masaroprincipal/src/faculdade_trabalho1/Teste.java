/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade_trabalho1;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        Aluno aln = new Aluno();
        Professor pro = new Professor();
        Aula aul = new Aula();
        Notas not = new Notas();
        Turma tur = new Turma();
        
        Disciplina int1 = new Disciplina(aln, pro, aul, not, tur);
        
        System.out.println("Digite o nome do aluno: ");
        aln.setNomeA(entrada.nextLine());
        System.out.println("Digite a idade do aluno: ");
        aln.setIdadeA(entrada.nextInt());
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite o endereço do aluno: ");
        aln.setEnderecoA(entrada2.nextLine());
        System.out.println("");
        System.out.println("Digite a nota da prova 1: ");
        not.setNotaProva1(entrada.nextInt());
        System.out.println("Digite a nota da prova 2: ");
        not.setNotaProva2(entrada.nextInt());
       
        System.out.println("Digite a quantidade de discipinas do aluno: ");
        int1.setQuantDisciplinas(entrada.nextInt());
        
        System.out.println("_______________________________________________");
        
        System.out.println("Digite o nome do professor: ");
        pro.setNomeP(entrada2.nextLine());
        
        System.out.println("Digite a matéria fixa do professor:  ");
        pro.setNomeDisciplina(entrada2.nextLine());
        
        System.out.println("Digite a carga horária do professor:  ");
        pro.setTempoServico(entrada2.nextInt());
        
        System.out.println("_______________________________________________");
        
        System.out.println("Digite a tempo de duração de cada aula: ");
        aul.setTempoDuracao(entrada2.nextInt());
        
        System.out.println("Digite o tempo de duração do intervalo: ");
        aul.setIntervalo(entrada2.nextInt());
        
        System.out.println("_______________________________________________");
        
        System.out.println("Digite a quantidade de alunos matriculados: ");
        tur.setListaMatriculados(entrada2.nextInt());
        
        System.out.println("_______________________________________________");
        System.out.println("");
        int1.visualizarDisciplina();
        
    }
}
