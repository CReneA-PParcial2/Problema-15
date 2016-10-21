/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg15;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TABLA DE 10X10 LLENADA CON NUMEROS ALEATORIOS
        int[][]arreglo = new int [11][11];
        llenarArreglo(arreglo);
        mostrarArreglo(arreglo);
    }
    
    //CALCULO DE SUMAS DE LAS FILAS Y COLUMNAS
    public static int[][] llenarArreglo(int [][] a){
        int i, j, total=0;
        Random numeroAleatorio = new Random();
        for(i=0; i<a.length; i++){
            for(j=0; j<a.length; j++){
                if(j==a.length-1){
                    for(j=0;j<a.length-1;j++){
                        total= total + a[i][j];
                    }
                    total=0;
                }else{
                    a[i][j] = numeroAleatorio.nextInt(10+1);
                }
                if (i==10){
                    total = 0;
                    for(i=0; i<a.length-1; i++){
                        total = a[i][j] + total;
                    }
                    a[i][j] = total;
                }
            }
        }
        return a;
    }
    
    //IMPRESION DE LA TABLA
    public static void mostrarArreglo(int [][]a){
        for (int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if (j<10 && i<10){
                    System.out.print(a[i][j] + "\t");
                }else{
                    System.out.print("(" + a[i][j] + ")" + "\t");
                }
            }
            System.out.print("\n");
        }
    }
}
