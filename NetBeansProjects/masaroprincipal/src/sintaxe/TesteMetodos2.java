/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

/**
 *
 * @author 12968505602
 */
public class TesteMetodos2 {
    public static void main(String[] args) {
        Metodos x = new Metodos();
        x.n1=300;
        x.n2 = 400;
        double totalSoma = x.soma2();
        System.out.println("Resultado: "+x.soma2());
        System.out.println("Resultado: "+totalSoma);
        System.out.println("Resultado: "+x.resultado);    
    }
}
