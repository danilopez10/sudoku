/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.Scanner;

/**
 *
 * @author Daniel López Avilés
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Sudoku juego = new Sudoku();

        System.out.println("1. Iniciar/Reiniciar sudoku → Iniciará o reiniciará el sudoku con el que se está\n"
                + "jugando.\n"
                + "2. Realizar movimiento → Pedirá las coordenadas de la casilla en la que se\n"
                + "quiere poner un número y en el caso de que el número sea válido para esa\n"
                + "casilla se guardará, también habrá que comprobar que en esa casilla no\n"
                + "haya ningún número previamente.\n"
                + "3. Vaciar casilla → Pedirá las coordenadas de la casilla de la que se quiere\n"
                + "borrar un número ya existente.\n"
                + "4. Mostrar sudoku → Mostrará el sudoku por la pantalla.\n"
                + "5. Terminar → Termina la partida.");
        
    }

}
