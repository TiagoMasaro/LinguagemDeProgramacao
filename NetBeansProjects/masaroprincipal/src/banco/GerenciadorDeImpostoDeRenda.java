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
public class GerenciadorDeImpostoDeRenda {
    private double total;
    
    void adiciona(Tributavel t){
        System.out.println("Adicionando tributável: "+t);
        this.total+=t.calculaTributos();
    }

    public double getTotal() {
        return this.total;
    }
    
}
