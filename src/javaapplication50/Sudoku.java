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
        linea0.set(4,7);
        linea1.set(0,5);
        linea1.set(1,4);
        linea1.set(5,6);
        linea1.set(7, 7);
        linea2.set(0,7);
        linea2.set(3,5);
        linea2.set(3,5);
        linea2.set(6,4);
        linea2.set(8,1);
        linea3.set(1,5);
        linea3.set(5,8);
        linea3.set(7,1);
        linea3.set(8,7);
        linea4.set(2,7);
        linea4.set(3,3);
        linea4.set(7,5);
        linea4.set(8,2);
        linea5.set(2,9);
        linea5.set(8,4);
        linea6.set(0,9);
        linea6.set(1,7);
        linea6.set(2,4);
        linea6.set(5,2);
        linea7.set(1,3);
        linea7.set(2,8);
        linea7.set(3,7);
        linea7.set(8,9);
        linea8.set(5,4);
        linea8.set(7,3);
        linea8.set(8,8);
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
        for (int i = 0; i < 9; i++) {
            if((sudoku.get(fila).get(i))==elemento)
            {
               resultado=false; 
            }
        }
        return resultado;
    }

    private boolean comprobarColumna(int columna, int elemento) {
        boolean resultado = true;
        if(linea1.get(columna)==elemento)
        {
            resultado=false;
        }
        if(linea2.get(columna)==elemento)
        {
            resultado=false;
        }
        if(linea3.get(columna)==elemento)
        {
            resultado=false;
        }
        if(linea4.get(columna)==elemento)
        {
            resultado=false;
        }
        if(linea5.get(columna)==elemento)
        {
            resultado=false;
        }
        if(linea6.get(columna)==elemento)
        {
            resultado=false;
        }
        if(linea7.get(columna)==elemento)
        {
            resultado=false;
        }
        if(linea8.get(columna)==elemento)
        {
            resultado=false;
        }
        if(linea0.get(columna)==elemento)
        {
            resultado=false;
        }
        return resultado;
    }

    private boolean comprobarCuadrante(int fila, int columna, int elemento) {
        boolean resultado = true;
        if(fila>-1&&fila<3&&columna>-1&&columna<3)
        {
            //cuadrante 1
        }
        if(fila<6&&fila>2&&columna<3&&columna>-1)
        {
            //cuadrante 2
        }
        if(fila<9&&fila>5&&columna<3&&columna>-1)
        {
            //cuadrante 3
        }
        if(fila<3&&fila>-1&&columna<6&&columna>2)
        {
            //cuadrante 4
        }
        if(fila<6&&fila>2&&columna<6&&columna>2)
        {
            //cuadrante 5
        }
        if(fila<9&&fila>5&&columna<6&&columna>2)
        {
            //cuadrante 6
        }
        if(fila<3&&fila>-1&&columna<9&&columna>5)
        {
            //cuadrante 7
        }
        if(fila<6&&fila>2&&columna<9&&columna>5)
        {
            //cuadrante 8
        }
        if(fila<9&&fila>5&&columna<9&&columna>5)
        {
            //cuadrante9
        }
        return resultado;
    }

    private boolean puedoInsertar(int fila, int columna, int elemento) {
        boolean resultado = false;
        return resultado;
    }
}
