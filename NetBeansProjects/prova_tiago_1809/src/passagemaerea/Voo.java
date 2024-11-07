/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagemaerea;

/**
 *
 * @author 12968505602
 */
public abstract class Voo {
    private String destino;
    private double preco;

    public Voo(String destino, double preco) {
        this.destino = destino;
        this.preco = preco;
    }

    public String getDestino() {
        return destino;
    }

    public double getPreco() {
        return preco;
    }

    public abstract double descontoEspecial();
}