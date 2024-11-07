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
public class ContaPoupanca extends Conta {
    @Override
    void atualiza(double taxa){
        try {
            super.deposita(super.getSaldo()*(taxa*3));
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(ContaPoupanca.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
