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
public class ContaPoupanca extends Conta {
    @Override
    void atualiza(double taxa){
        super.deposita(super.getSaldo()*(taxa*3));
       
    }
    
}
