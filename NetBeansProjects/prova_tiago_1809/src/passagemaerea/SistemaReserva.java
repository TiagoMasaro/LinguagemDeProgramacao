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
public class SistemaReserva {
    public void criarReserva(Passageiro passageiro, Voo voo) throws Exception {
        if (passageiro == null || voo == null) {
            throw new Exception("Passageiro ou Voo inválido.");
        }
        Reserva reserva = new Reserva(passageiro, voo);
        reserva.exibirDetalhes();
    }
}