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
public class TesteHeranca {
    public static void main(String[] args) {
        Funcionario objFuncionario = new Gerente(1234, 5, "Clodoaldo");
        Gerente objGerente = new Gerente(123,2,"Joel");
        Supervisor objSupervisor = new Supervisor("Luka");
        //objFuncionario.setNome("Messi");
       // objGerente.setNome("Joel");
        //objSupervisor.setNome("Júlio");
        
        objGerente.setSenha(123);
        objGerente.autentica(145);
        objFuncionario.setSalario(1000);
        objGerente.setSalario(1000);
        objSupervisor.setSalario(1000);
        objFuncionario.getBonificacao();
        objGerente.getBonificacao();
        objSupervisor.getBonificacao();
        
        System.out.println("Supervisor:");
        objSupervisor.mostra();
        System.out.println("Fúncionário:");
        objFuncionario.mostra();
        System.out.println("Gerente:");
        objGerente.mostra();
        
    }
    
}
