/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade_trabalho1;

/**
 *
 * @author Tiago
 */
public class Disciplina {
    
   
    private int quantDisciplinas;

    public int getQuantDisciplinas() {
        return quantDisciplinas;
    }

    public void setQuantDisciplinas(int quantDisciplinas) {
        this.quantDisciplinas = quantDisciplinas;
    }

 
    Aluno aln;
    Professor  pro;
    Aula aul;
    Notas not;
    Turma tur;

    public Disciplina(Aluno aln, Professor pro, Aula aul, Notas not, Turma tur) {
        this.aln = aln;
        this.pro = pro;
        this.aul = aul;
        this.not = not;
        this.tur = tur;
   
   
    }
    
        
    public void visualizarDisciplina() {

    System.out.println("Nome do aluno: "+aln.getNomeA());
    System.out.println("Idade do aluno: "+aln.getIdadeA());
    System.out.println("Endereço do aluno: "+aln.getEnderecoA());
    
    System.out.println("Nota 1: "+not.getNotaProva1());
    System.out.println("Nota 2: "+not.getNotaProva2());
    System.out.println("Média Notas: "+not.getMediaNotas());
    
    System.out.println("Quantidade de disciplinas: "+this.getQuantDisciplinas());
    
    System.out.println("_________________________________");
    
    System.out.println("Nome do professor: "+pro.getNomeP());
    System.out.println("Disciplina que o professor exerce: "+pro.getNomeDisciplina());
    System.out.println("Carga horária professor: "+pro.getTempoServico());
   
    System.out.println("_________________________________");
    
    System.out.println("Tempo de duração (aula): "+aul.getTempoDuracao());
    System.out.println("Tempo de duração (intervalo): "+aul.getIntervalo());
    System.out.println("Quantidade alunos matriculados: "+tur.getListaMatriculados());
    System.out.println("_________________________________");
    System.out.println("");
   

    
    }
}
