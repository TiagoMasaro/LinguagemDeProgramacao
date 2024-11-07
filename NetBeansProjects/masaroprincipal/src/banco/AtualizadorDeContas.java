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
public class AtualizadorDeContas {
   
private double saldoTotal = 0;
private double selic;
AtualizadorDeContas(double selic) {
this.selic = selic;
}



void roda(Conta c) {
    System.out.println("Saldo anterior: "+c.getSaldo());
    c.atualiza(this.selic);
    System.out.println("Saldo final: "+c.getSaldo());
    this.saldoTotal+=c.getSaldo();
   
     
}

    public double getSaldoTotal() {
        
        return saldoTotal;
    }


    

}
