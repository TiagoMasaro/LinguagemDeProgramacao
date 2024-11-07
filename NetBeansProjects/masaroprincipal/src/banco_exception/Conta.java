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
abstract class Conta {
    
    private int numero;
    
    private double saldo;
    private double limite;
    private int identificador;

    

    public int getIdentificador() {
        return identificador;
    }
    
    //Cliente objCliente = new Cliente();
    
    private static int totalDecontas; // variável static pertence a classe
    Conta(){
        Conta.totalDecontas = Conta.totalDecontas+1;
        this.identificador = Conta.totalDecontas;
        System.out.println("Construindo uma conta");
    }

    public static int getTotalDecontas() {
        return totalDecontas;
    }
    
    Conta(double saldo){
        this(); //chama construtor padrão
       
        this.saldo = saldo;
    }
    Conta(double saldo, double limite, int numero) {
       this(saldo);
       this.limite = limite;
       this.numero = numero;
    } 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

    public double getSaldo() {
        return saldo+limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    public boolean saca(double quantidade ) {
        if (this.getSaldo()>=quantidade){
        this.saldo = this.saldo - quantidade;
        return true; }
        else{
              System.out.println("Saldo insuficiente: "+this.getSaldo());
                return false;
        }
    }
    public void deposita(double quantidade) throws ValorInvalidoException  {
        if(quantidade<0){
         throw new ValorInvalidoException(quantidade);  
        } else{
            this.saldo = this.saldo + quantidade;
        }
        
    }
                
        
    
    public void tranfere(Conta destino, double quantidade){
       // this.saldo = this.saldo - quantidade; //saque
        //destino.saldo = destino.saldo + quantidade; // depósito
        if(this.saca(quantidade)) {
            try {
                destino.deposita(quantidade);
            } catch (ValorInvalidoException ex) {
                Logger.getLogger(Conta.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Transferência realizada com sucesso");
        } else {
            System.out.println("Tranferência não realizada");
        }
        
        
    }
    
   abstract void atualiza(double taxa);
       
       
    
    
}
