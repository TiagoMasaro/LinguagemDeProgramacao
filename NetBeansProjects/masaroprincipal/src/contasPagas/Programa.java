/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author 12968505602
 */
public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        c1.cli.setNomeCliente("Tiago");
        c1.cli.setCpf("129.455.056-89");
        c1.pro.setDescricaoProduto("Camaro Amarelo");
        c1.pro.setValorProduto("1000000");
        c1.setIdConta("789");
        c1.setDataPagamento("14/04/2024");
        c1.setDataVencimento("14/12/2024");
        
        c1.visualizarConta();
        
        System.out.println("_______________________________");
        
        c2.cli.setNomeCliente("Ana");
        c2.cli.setCpf("239.365.046-80");
        c2.pro.setDescricaoProduto("Ferrari");
        c2.pro.setValorProduto("2000000");
        c2.setIdConta("567");
        c2.setDataPagamento("14/04/2024");
        c2.setDataVencimento("14/12/2024");
        
        c2.visualizarConta();
    }
}
