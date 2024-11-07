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
public class TesteReferencia {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente();
        //Cliente cliente1 = new Cliente();
        //conta1.objCliente = cliente1;
        conta1.objCliente.setNomeCliente("Denise");
        
        //cliente1.setNomeCliente("Denise");
        conta1.deposita(1000);
        
        System.out.println("Cliente: "+conta1.objCliente.getNomeCliente());
        System.out.println("Saldo: "+conta1.getSaldo());
        
        
    }
    
}
