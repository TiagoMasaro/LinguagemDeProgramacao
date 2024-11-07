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
public class ContaCorrente implements ContaTributavel {
    
    private double Saldo;

    @Override
    public double getSaldo() {
        return this.Saldo-this.calculaTributos();
    }

    @Override
    public void deposita(double valor) {
        this.Saldo+=valor;
    }

    @Override
    public void saca(double valor) {
        if(this.Saldo>=valor){
            this.Saldo=this.Saldo-valor;
        }
        else{
            System.out.println("Não é possivel realizar o saque. Saldo insuficiente");
        }
    }

    
    @Override
    public void atualiza(double taxaSelic) {
        this.deposita(this.Saldo*0.10);
    }

    @Override
    public double calculaTributos() {
        return this.Saldo*0.01;
    }
    
    
}
