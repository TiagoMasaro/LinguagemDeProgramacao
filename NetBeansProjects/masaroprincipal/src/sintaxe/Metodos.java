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
public class Metodos {
    
       double n1,n2,resultado;//Atributos ou variáveis de intância
       
       public void soma(){ // método sem retorno (void) e sem passagem de parâmetros
           this.resultado = this.n1  + this.n2;//this para referenciar a variavel local
       } 
       
       
       public double soma2(){//método retorno (double) e sem passsagem de parâmetro
           return this.resultado = this.n1  + this.n2;
       }
       
       public double soma (double n1, double n2){//método retorno e com parâmetro
       this.n1 = n1;
       this.n2 = n2;
       return this. resultado = this.n1 + this.n2;
       }
    
       public double subtracao (double n1, double n2){
       this.n1 = n1;
       this.n2 = n2;
       return this. resultado = this.n1 - this.n2;
       }
       
       public double multiplicacao (double n1, double n2){
       this.n1 = n1;
       this.n2 = n2;
       return this. resultado = this.n1 * this.n2;
       }
       public double divisao (double n1, double n2){
       this.n1 = n1;
       this.n2 = n2;
       return this. resultado = this.n1 / this.n2;
       }
       public double resto (double n1, double n2){
       this.n1 = n1;
       this.n2 = n2;
       return this. resultado = this.n1 % this.n2;
       }
           
}
       
