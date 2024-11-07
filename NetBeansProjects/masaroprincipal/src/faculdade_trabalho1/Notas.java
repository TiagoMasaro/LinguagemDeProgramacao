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
public class Notas {
    private double notaProva1;
    private double notaProva2;
    private double MediaNotas;

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getMediaNotas() {
        MediaNotas = (this.notaProva1 + this.notaProva2)/2;
        return MediaNotas;
    }

    public void setMediaNotas(double MediaNotas) {
        this.MediaNotas = MediaNotas;
    }
    

   
   
    
}
