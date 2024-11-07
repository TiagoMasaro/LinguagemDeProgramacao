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
    interface AreaCalculavel{
        double calculaArea();
    }

    class Quadrado implements AreaCalculavel {
    private int lado;

    public Quadrado(int lado){
    this.lado = lado;
    }
    @Override
    public double calculaArea(){
    return this.lado * this.lado;
    }
    }


    class Retangulo implements AreaCalculavel{
    private int largura;
    private int altura;
    
    public Retangulo(int largura, int altura){
    this.largura = largura;
    this.altura = altura;
    }
    
    @Override
    public double calculaArea(){
        return this.largura * this.altura;
    }
    }

