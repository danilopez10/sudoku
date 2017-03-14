/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author Daniel López Avilés
 */
class SudokuException extends Exception {

    /**
     * Crea una excepcion pasando una cadena de texto con el mensaje
     * @param mensaje Mensaje para devolver 
     */
    public SudokuException(String mensaje) {
        /*
        Llamaos al constructor de la clase padre (Exception)
        Con esto hacemos que se lance la excepción con el mensaje que queramos.
         */
        super(mensaje);
    }   
}
