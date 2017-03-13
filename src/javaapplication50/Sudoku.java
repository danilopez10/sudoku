/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.ArrayList;

/**
* Clase que representa a un Sudoku.
* @author Daniel López Avilés
* @version 1.0
*/
public class Sudoku {

    // Variables privadas de la clase
    private final ArrayList<ArrayList<Integer>> sudoku=new ArrayList<>();
    
    /**
    * Constructor de la clase Sudoku
    */
    
    public Sudoku() {
        
        ArrayList<Integer> linea0=new ArrayList<>();
        ArrayList<Integer> linea1=new ArrayList<>();
        ArrayList<Integer> linea2=new ArrayList<>();
        ArrayList<Integer> linea3=new ArrayList<>();
        ArrayList<Integer> linea4=new ArrayList<>();
        ArrayList<Integer> linea5=new ArrayList<>();
        ArrayList<Integer> linea6=new ArrayList<>();
        ArrayList<Integer> linea7=new ArrayList<>();
        ArrayList<Integer> linea8=new ArrayList<>();
        
    }
    
    
    public void inicializar() {
    }

    @Override
    public String toString() {
        String resultadoFinal = "";
        return resultadoFinal;
    }

    public void modificarElemento(int fila, int columna, int elemento) throws SudokuException {

    }

    public void vaciarElemento(int fila, int columna) {

    }

    private boolean comprobarFila(int fila, int elemento) {
        boolean resultado = true;
        return resultado;
    }

    private boolean comprobarColumna(int columna, int elemento) {
        boolean resultado = true;
        return resultado;
    }

    private boolean comprobarCuadrante(int fila, int columna, int elemento) {
        boolean resultado = true;

        return resultado;
    }

    private boolean puedoInsertar(int fila, int columna, int elemento) {
        boolean resultado = false;
        return resultado;
    }
}
