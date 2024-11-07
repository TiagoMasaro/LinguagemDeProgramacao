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
public class Conta {
    private String idConta; 
    private String dataVencimento; 
    private String dataPagamento;
            
    public String getIdConta() {            
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    Produto pro = new Produto();
    Cliente cli = new Cliente();
    
    public void visualizarConta (){
        System.out.println("Identificador da conta: "+this.idConta);
        System.out.println("Nome do produto: "+pro.getDescricaoProduto());
        System.out.println("Cliente:"+cli.getNomeCliente() + "Cpf: " + cli.getCpf());
        System.out.println("Valor do produto: "+pro.getValorProduto());
        System.out.println("Data de Vencimento: "+this.getDataVencimento());
        System.out.println("Data de pagamento: "+this.getDataPagamento());
        
    }
}
