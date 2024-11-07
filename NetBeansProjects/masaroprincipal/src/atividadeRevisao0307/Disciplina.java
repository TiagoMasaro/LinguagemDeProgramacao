/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeRevisao0307;

/**
 *
 * @author 12968505602
 */
public class Disciplina {
    
    private String nomeD;
    
    private int quant_displ;


    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public int getQuant_displ() {
        return quant_displ;
    }

    public void setQuant_displ(int quant_displ) {
        this.quant_displ = quant_displ;
    }

    public Aluno getAln() {
        return aln;
    }

    public void setAln(Aluno aln) {
        this.aln = aln;
    }

    public Professor getPro() {
        return pro;
    }

    public void setPro(Professor pro) {
        this.pro = pro;
    }

    public Turma getTur() {
        return tur;
    }

    public void setTur(Turma tur) {
        this.tur = tur;
    }
    
    Aluno aln;
    Professor  pro;
    Turma tur;
    Notas not;

    public Disciplina(Aluno aln, Professor pro, Turma tur, Notas not) {
        this.aln = aln;
        this.pro = pro;
        this.tur = tur;
        this.not = not;
    }
    
    

    
    public void visualizadorDisciplina(){
        
        System.out.println(" ");
        System.out.println("-----Cadastro do aluno-----  ");
        System.out.println("Nome do aluno: "+aln.getNomeA());
        System.out.println("Matrícula do aluno: "+aln.getCadastroA());
        
        System.out.println("_____________________________");
        System.out.println(" ");
        System.out.println("-----Cadastro do professor-----  ");
        System.out.println("Nome do professor: "+pro.getNomeP());
        System.out.println("Cadastro do professor: "+pro.getCadastroP());
        
        System.out.println("_____________________________");
        System.out.println(" ");
        System.out.println("Turma: "+tur.getNomeT());
        System.out.println("Quantidade de alunos: "+tur.getQuant_alun());
        
        System.out.println("_____________________________");
        System.out.println(" ");
        System.out.println("Nome da disciplina: "+this.nomeD);
        System.out.println("Quantidade de disciplinas: "+this.quant_displ);
        
        System.out.println("_____________________________");  
        System.out.println(" ");
        System.out.println("-----Sistemas de Provas do aluno-----");
        System.out.println("Nota prova 1: "+not.getNota1());
        System.out.println("Nota prova 2: "+not.getNota2());
        System.out.println("Nota prova 3: "+not.getNota3());
        System.out.println("Medía das provas: "+not.getMediaNotas());
        
        if(not.getSomaNotas()< 6){
            System.out.println("Aluno Reprovado ");
        }else{
            System.out.println("Aluno Aprovado ");
        }
        System.out.println("_____________________________");
    }
}
