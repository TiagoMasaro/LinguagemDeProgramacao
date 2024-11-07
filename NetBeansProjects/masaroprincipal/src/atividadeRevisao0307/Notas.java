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
public class Notas {
    private double nota1;
    private double nota2;
    private double nota3;
    private double mediaNotas;
    private double somaNotas;

   

    
    
    public double getNota1() {
        return nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMediaNotas() {
        mediaNotas = (this.nota1 + this.nota2 + this.nota3)/3;
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }
     public double getSomaNotas() {
        somaNotas = (this.nota1 + this.nota2 + this.nota3);
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas){ 
        this.somaNotas = somaNotas;
    }
    
    
    
    
}
