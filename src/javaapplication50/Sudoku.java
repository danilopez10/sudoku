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
    private ArrayList<ArrayList<Integer>> sudoku=new ArrayList<>();
    ArrayList<Integer> linea0;
    ArrayList<Integer> linea1;
    ArrayList<Integer> linea2;
    ArrayList<Integer> linea3;
    ArrayList<Integer> linea4;
    ArrayList<Integer> linea5;
    ArrayList<Integer> linea6;
    ArrayList<Integer> linea7;
    ArrayList<Integer> linea8;
    /**
    * Constructor de la clase Sudoku
    */
    
    public Sudoku() {
        sudoku=new ArrayList<>();
        linea0=new ArrayList<>();
        linea1=new ArrayList<>();
        linea2=new ArrayList<>();
        linea3=new ArrayList<>();
        linea4=new ArrayList<>();
        linea5=new ArrayList<>();
        linea6=new ArrayList<>();
        linea7=new ArrayList<>();
        linea8=new ArrayList<>();
    }
    
    
    public void inicializar() {
        for (int i = 0; i < 9; i++) {
            linea0.add(0);
            linea1.add(0);
            linea2.add(0);
            linea3.add(0);
            linea4.add(0);
            linea5.add(0);
            linea6.add(0);
            linea7.add(0);
            linea8.add(0);
        }
        linea0.set(1,2);
        
    }

    @Override
    public String toString() {
        String resultadoFinal = "";
        resultadoFinal=linea0.toString()+"\n"+linea1.toString()+"\n"+linea2.toString()+"\n"+linea3.toString()+"\n"+linea4.toString()+"\n"+linea5.toString()+"\n"+linea6.toString()+"\n"+linea7.toString()+"\n"+linea8.toString();
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
