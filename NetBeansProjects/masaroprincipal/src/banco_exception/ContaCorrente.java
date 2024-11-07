/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 13646883600
 */
public class ContaCorrente extends Conta implements Tributavel{
   
   
    
    
    @Override
    public void deposita(double quantidade) throws ValorInvalidoException {
        super.deposita(quantidade-1);
    }

    @Override
    void atualiza(double taxa) {
        try {
            super.deposita(super.getSaldo()*(taxa*2));
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(ContaCorrente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo()*0.01;
    }
    
    
   

     
    
}
