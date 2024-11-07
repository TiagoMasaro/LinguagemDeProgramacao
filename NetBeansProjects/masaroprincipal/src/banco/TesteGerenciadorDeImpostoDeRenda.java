/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Nycollas
 */
public class TesteGerenciadorDeImpostoDeRenda {
    public static void main(String[] args) {
      GerenciadorDeImpostoDeRenda gerente = new GerenciadorDeImpostoDeRenda();
      SeguroDeVida sv = new SeguroDeVida();
      gerente.adiciona(sv);
      ContaCorrente cc = new  ContaCorrente();
      cc.deposita(1000);
      gerente.adiciona(cc);
        System.out.println(gerente.getTotal());
        System.out.printf("O saldo é: %.2f;", cc.getSaldo()-cc.calculaTributos());
    }
    
}
