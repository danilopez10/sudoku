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
        Scanner teclado = new Scanner(System.in);
        Sudoku juego = new Sudoku();
        int resultado = 1;

        while (resultado != 5) {
            System.out.println("1. Iniciar/Reiniciar sudoku (Iniciará o reiniciará el sudoku)\n"
                    + "2. Realizar movimiento \n"
                    + "3. Vaciar casilla\n"
                    + "4. Mostrar sudoku\n"
                    + "5. Terminar");
            resultado = teclado.nextInt();
            if (resultado == 1) {
                juego.inicializar();
            }
            if (resultado == 4) {
                System.out.println(juego.toString());
            }
        }
    }

}
