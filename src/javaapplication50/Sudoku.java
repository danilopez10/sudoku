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
    
    /**
     * Metodo para iniciar el juego(inicia todas las casillas con su correspondiente número)
     */
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

    /**
     * Devuelve los metodos toString de cada array, para ver el sudoku al completo
     * @return resultadoFinal 
     */
    @Override
    public String toString() {
        String resultadoFinal = "";
        resultadoFinal=linea0.toString()+"\n"+linea1.toString()+"\n"+linea2.toString()+"\n"+linea3.toString()+"\n"+linea4.toString()+"\n"+linea5.toString()+"\n"+linea6.toString()+"\n"+linea7.toString()+"\n"+linea8.toString();
        return resultadoFinal;
    }

    /**
     * Llama a metodo puedoInsertar
     * Comprueba que fila es, y con el metodo set modifica el elemento de dicha columna
     * @param fila Numero de fila(array)
     * @param columna Numero de posicion de la fila(array)
     * @param elemento Numero a introducir
     * @throws SudokuException  Excepcion para comunicar que no se puede introducir
     */
    public void modificarElemento(int fila, int columna, int elemento) throws SudokuException {
        if((this.puedoInsertar(fila, columna, elemento))==true)
        {
            if(fila==0)
            {
                linea0.set(columna, elemento);
            }
            if(fila==1)
            {
                linea1.set(columna, elemento);
            }
            if(fila==2)
            {
                linea2.set(columna, elemento);
            }
            if(fila==3)
            {
                linea3.set(columna, elemento);
            }
            if(fila==4)
            {
                linea4.set(columna, elemento);
            }
            if(fila==5)
            {
                linea5.set(columna, elemento);
            }
            if(fila==6)
            {
                linea6.set(columna, elemento);
            }
            if(fila==7)
            {
                linea7.set(columna, elemento);
            }
            if(fila==8)
            {
                linea8.set(columna, elemento);
            }
            
            
        }
        else
        {
            throw new SudokuException("Dicho número no puede introducirse en dicha casilla");
        }
    }

    /**
     * Comprueba que fila es y despues moficia la columna a 0
     * @param fila Numero de fila(array)
     * @param columna Numero de posicion de la fila(array) 
     */
    public void vaciarElemento(int fila, int columna) {
        if(fila==0)
            {
                linea0.set(columna, 0);
            }
            if(fila==1)
            {
                linea1.set(columna, 0);
            }
            if(fila==2)
            {
                linea2.set(columna, 0);
            }
            if(fila==3)
            {
                linea3.set(columna, 0);
            }
            if(fila==4)
            {
                linea4.set(columna, 0);
            }
            if(fila==5)
            {
                linea5.set(columna, 0);
            }
            if(fila==6)
            {
                linea6.set(columna, 0);
            }
            if(fila==7)
            {
                linea7.set(columna, 0);
            }
            if(fila==8)
            {
                linea8.set(columna, 0);
            }
            
    }
    /**
     * Comprueba que fila es y despues comprueba que no este dicho elemento en dicha fila
     * Devuelce un booleano para ver si se puede o no
     * @param fila Numero de fila(array)
     * @param elemento Numero a introducir
     * @return resultado
     */
    private boolean comprobarFila(int fila, int elemento) {
        boolean resultado = true;
        if (fila == 0) {
            for (int i = 0; i < 9; i++) {
                if (linea0.get(i) == elemento) {
                    resultado = false;
                }
            }
        }
        if (fila == 1) {
            for (int i = 0; i < 9; i++) {
                if ((linea1.get(i)) == elemento) {
                    resultado = false;
                }
            }
        }
        if (fila == 2) {
            for (int i = 0; i < 9; i++) {
                if (linea2.get(i) == elemento) {
                    resultado = false;
                }
            }
        }
        if (fila == 3) {
            for (int i = 0; i < 9; i++) {
                if (linea3.get(i) == elemento) {
                    resultado = false;
                }
            }
        }
        if (fila == 4) {
            for (int i = 0; i < 9; i++) {
                if (linea4.get(i) == elemento) {
                    resultado = false;
                }
            }
        }
        if (fila == 5) {
            for (int i = 0; i < 9; i++) {
                if (linea5.get(i) == elemento) {
                    resultado = false;
                }
            }
        }
        if (fila == 6) {
            for (int i = 0; i < 9; i++) {
                if (linea6.get(i) == elemento) {
                    resultado = false;
                }
            }
        }
        if (fila == 7) {
            for (int i = 0; i < 9; i++) {
                if (linea7.get(i) == elemento) {
                    resultado = false;
                }
            }
        }
        if (fila == 8) {
            for (int i = 0; i < 9; i++) {
                if (linea8.get(i) == elemento) {
                    resultado = false;
                }
            }
        }

        return resultado;
    }
    
    /**
     * Comprueba que dicho elemento no este en ninguna columna
     * Devuelce un booleano para ver si se puede o no
     * @param columna Numero de posicion de la fila(array)
     * @param elemento Numero a introducir
     * @return resultado
     */
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

    /**
     * Comprueba que ficho elemento no este en ningun cuadrante
     * Devuelve un boleano para ver si se puede o no introducir dicho numero
     * @param fila Numero de fila(array)
     * @param columna Numero de posicion de la fila(array)
     * @param elemento Numero a introducir
     * @return resultado
     */
    private boolean comprobarCuadrante(int fila, int columna, int elemento) {
        boolean resultado = true;
        if(fila>-1&&fila<3&&columna>-1&&columna<3)
        {
            //cuadrante 1
            for (int i = 0; i < 3; i++) {
                if(linea0.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea1.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea2.get(i)==elemento)
                {
                    resultado=false;
                }
            }
        }
        if(fila<6&&fila>2&&columna<3&&columna>-1)
        {
            //cuadrante 2
            for (int i = 0; i < 3; i++) {
                if(linea3.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea4.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea5.get(i)==elemento)
                {
                    resultado=false;
                }
            }
        }
        if(fila<9&&fila>5&&columna<3&&columna>-1)
        {
            //cuadrante 3
            for (int i = 0; i < 3; i++) {
                if(linea6.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea7.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea8.get(i)==elemento)
                {
                    resultado=false;
                }
            }
        }
        if(fila<3&&fila>-1&&columna<6&&columna>2)
        {
            //cuadrante 4
            for (int i = 3; i < 6; i++) {
                if(linea0.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea1.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea2.get(i)==elemento)
                {
                    resultado=false;
                }
            }
        }
        if(fila<6&&fila>2&&columna<6&&columna>2)
        {
            //cuadrante 5
            for (int i = 3; i < 6; i++) {
                if(linea3.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea4.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea5.get(i)==elemento)
                {
                    resultado=false;
                }
            }
        }
        if(fila<9&&fila>5&&columna<6&&columna>2)
        {
            //cuadrante 6
            for (int i = 3; i < 6; i++) {
                if(linea6.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea7.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea8.get(i)==elemento)
                {
                    resultado=false;
                }
            }
        }
        if(fila<3&&fila>-1&&columna<9&&columna>5)
        {
            //cuadrante 7
            for (int i = 6; i < 9; i++) {
                if(linea0.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea1.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea2.get(i)==elemento)
                {
                    resultado=false;
                }
            }
        }
        if(fila<6&&fila>2&&columna<9&&columna>5)
        {
            //cuadrante 8
            for (int i = 6; i < 9; i++) {
                if(linea3.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea4.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea5.get(i)==elemento)
                {
                    resultado=false;
                }
            }
        }
        if(fila<9&&fila>5&&columna<9&&columna>5)
        {
            //cuadrante9
            for (int i = 6; i < 9; i++) {
                if(linea6.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea7.get(i)==elemento)
                {
                    resultado=false;
                }
                if(linea8.get(i)==elemento)
                {
                    resultado=false;
                }
            }
        }
        return resultado;
    }
    
    /**
     * Llama a los metodos comprobarColumna, comprobarCuadrante y comprobarFila y si los tres devuelven verdadero es que dicho numero se puede introducir
     * Devuelve un boleano para ver si podemos introducir dicho numero
     * @param fila Numero de fila(array)
     * @param columna Numero de posicion de la fila(array)
     * @param elemento Numero a introducir
     * @return resultado
     */
    private boolean puedoInsertar(int fila, int columna, int elemento) {
        boolean resultado = false;
        if (this.comprobarColumna(columna, elemento) == true) {
            resultado = true;

            if (this.comprobarCuadrante(fila, columna, elemento) == true) {
                resultado = true;

                if (this.comprobarFila(fila, elemento) == true) {
                    resultado = true;
                }
                else
                {
                    resultado=false;
                }
            }
            else
            {
                resultado=false;
            }
        }
        else
        {
            resultado=false;
        }
        return resultado;
    }
}
