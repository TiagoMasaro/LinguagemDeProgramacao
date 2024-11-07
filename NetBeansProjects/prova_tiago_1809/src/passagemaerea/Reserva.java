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
public class Reserva {
    private Passageiro passageiro;
    private Voo voo;

    public Reserva(Passageiro passageiro, Voo voo) {
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void exibirDetalhes() {
        System.out.println("Passageiro: " + passageiro.getNome());
        System.out.println("Destino do voo: " + voo.getDestino());
        System.out.println("Preço original: " + voo.getPreco());
        System.out.println("Preço com desconto: " + voo.descontoEspecial());
    }
}
