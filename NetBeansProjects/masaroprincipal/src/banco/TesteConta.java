/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

//set para enviar
//get para retornar
/**
 *
 * @author 13646883600
 */
public class TesteConta {
    public static void main(String[] args) {
       /* Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.deposita(3000.50); 
        c2.deposita(100000);
       // c1.setCliente("Lionel Messi");
        //c2.setCliente("Cristiano Ronaldo");
        c1.objCliente.setNomeCliente("Pedro");
        c2.objCliente.setNomeCliente("Maria");
        
        c1.saca(5000);
        c2.saca(100);
                
        System.out.println("Saldo da conta c1: "+c1.getSaldo()); 
        System.out.println("Saldo da conta c2: "+c2.getSaldo());
       // System.out.println("Cliente c1: "+c1.getCliente());
       // System.out.println("Cliente c2: "+c2.getCliente());
        System.out.println("Cliente c1: "+c1.objCliente.getDataNascimento());
        System.out.println("Cliente c3: "+c2.objCliente.getDataNascimento());
        
        */
        Conta c = new ContaCorrente();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();
    c.deposita(1000);
    cc.deposita(1000);
    cp.deposita(1000);
    c.atualiza(0.10);
    cc.atualiza(0.10);
    cp.atualiza(0.10);
    System.out.println(c.getSaldo());
    System.out.println(cc.getSaldo());
    System.out.println(cp.getSaldo());
        
               
    }
    
}
