/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Nycollas
 */
public class TesteFuncionario {
     /*public static void main(String[] args) {
        /*Funcionario n1 = new Funcionario();
        n1.setRg("77 777 777-77");
        n1.setNome("Messi");
        n1.setSalario(2000);
        n1.bonifica(300);
        n1.setDepartamento("Contabilidade");
        n1.setDataEntrada("13/03/2024");
        n1.ativo();
        //n1.demite();
        n1.mostra();
        
       /* System.out.println("Rg de n1: "+n1.getRg());
        System.out.println("Nome de n1: "+n1.getNome());
        System.out.println("Salário de n1: "+n1.getSalario());
        System.out.println("Departamento de n1: "+n1.getDepartamento());
        System.out.println("Data de entrada de n1: "+n1.getDataEntrada()); */
       
   // }
    
    public static void main(String[] args) {
        Funcionario objFuncionario = new Gerente(3456, 7, "Gérson");
        Funcionario objFuncionario2 = new Supervisor("Messi");
        
        objFuncionario.setSalario(10000);
        objFuncionario.bonifica(1000);
        objFuncionario.demite();
        objFuncionario.mostra();
        objFuncionario2.mostra();
        
        
       /* System.out.println("Nome: "+objFuncionario.getNome());
        System.out.println("Salário: "+objFuncionario.getSalario());
        System.out.println("Nome: "+objFuncionario2.getNome()); */
        
        
    }
}
