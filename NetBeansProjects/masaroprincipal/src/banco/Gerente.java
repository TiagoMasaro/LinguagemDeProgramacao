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
public class Gerente  extends Funcionario{
   private int senha;
   private int numeroDeFuncionariosGerenciados;

    public Gerente(int senha, int numeroDeFuncionariosGerenciados, String nome) {
        super(nome);
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

   

   

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    public boolean autentica(int senha){
        if(this.senha==senha){
            System.out.println("Acesso Permitido");
            return true;
        }
        else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
   @Override
     public double getBonificacao(){
        return super.getSalario()+1000;
    }
   
    
}
