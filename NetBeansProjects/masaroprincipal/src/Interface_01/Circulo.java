/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_01;

/**
 *
 * @author 12968505602
 */
    class Circulo implements AreaCalculavel {

        
    private double raio;
    
    @Override
    public double calculaArea() {
      return Math.PI * raio * raio;
    }
    //atributos (raio) e métodos (calculaArea)
    //Utilize Math.PI * raio * raio para calcular a área.
        
   
        
        
}   