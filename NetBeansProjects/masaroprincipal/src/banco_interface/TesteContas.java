/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_2;

/**
 *
 * @author Nycollas
 */
public class TesteContas {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Tributavel t  = new ContaCorrente();
         ContaTributavel cc1 = new ContaCorrente();
       
         cc1.deposita(1000);
         cc1.atualiza(0.1);
         System.out.println("Tributo da conta corrente:  "+cc1.calculaTributos());
         System.out.println("Saldo final: "+cc1.getSaldo());
        
    }
}
