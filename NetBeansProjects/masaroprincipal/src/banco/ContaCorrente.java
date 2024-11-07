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
public class ContaCorrente extends Conta implements Tributavel{
   
   
    
    
    @Override
    public void deposita(double quantidade) {
        super.deposita(quantidade-1);
    }

    @Override
    void atualiza(double taxa) {
        super.deposita(super.getSaldo()*(taxa*2));
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo()*0.01;
    }
    
    
   

     
    
}
