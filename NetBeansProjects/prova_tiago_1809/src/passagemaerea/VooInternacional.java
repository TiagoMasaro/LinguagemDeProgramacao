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
public class VooInternacional extends Voo implements Embarque {

    public VooInternacional(String destino, double preco) {
        super(destino, preco);
    }

    @Override
    public double descontoEspecial() {
        return getPreco() * 0.85; // 15% de desconto
    }

    @Override
    public void realizarEmbarque() {
        System.out.println("Passageiro embarcando em voo internacional.");
    }
}