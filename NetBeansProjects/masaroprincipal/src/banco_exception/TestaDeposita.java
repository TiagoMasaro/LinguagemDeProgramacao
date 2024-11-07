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
public class TestaDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        
            try {
                cp.deposita(-100);
            } catch (ValorInvalidoException ex) {
                System.out.println(ex.getMessage());
            }
    }
    
}
