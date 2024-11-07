/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_3;

/**
 *
 * @author 13646883600
 */
public class ValorInvalidoException extends Exception{
    ValorInvalidoException(double valor) {
super("Valor inválido: " + valor);
    
}

}
