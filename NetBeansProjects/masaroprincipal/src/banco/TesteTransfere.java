/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 13646883600
 */
public class TesteTransfere {
    public static void main(String[] args) {
        Conta minhaConta = new ContaCorrente();
        Conta outraConta = new ContaPoupanca();
        
        minhaConta.deposita(1000);
        outraConta.deposita(100);
        
        minhaConta.tranfere(outraConta, 10000);
        
        System.out.println("Saldo minhaConta: "+minhaConta.getSaldo());
        System.out.println("Saldo outaaConta: "+outraConta.getSaldo());
    }
    
}
