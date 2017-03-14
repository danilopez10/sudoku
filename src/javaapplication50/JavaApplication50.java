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
    public static void main(String[] args) throws SudokuException {
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
                if (resultado == 2) {
                    Scanner modificar = new Scanner(System.in);
                    System.out.println("Dime la fila");
                    int fila = modificar.nextInt();
                    Scanner modificar1=new Scanner(System.in);
                    System.out.println("Dime la columna");
                    int columna = modificar1.nextInt();
                    Scanner modificar2=new Scanner(System.in);
                    System.out.println("Dime el numero");
                    int numero = modificar2.nextInt();
                    try
                    {
                        juego.modificarElemento(fila, columna, numero);
                    }
                    catch(SudokuException e)
                    {
                        System.out.println("Se ha producido un error "+e.toString());
                    }
                }
                if(resultado==3)
                {
                    Scanner vaciar = new Scanner(System.in);
                    System.out.println("Dime la fila");
                    int fila = vaciar.nextInt();
                    System.out.println("Dime la columna");
                    int columna = vaciar.nextInt();
                    juego.vaciarElemento(fila,columna);
                }
            
            

        }
    }

}
