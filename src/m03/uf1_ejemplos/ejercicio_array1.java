/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1_ejemplos;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class ejercicio_array1 {
     public static void main(String[] args) {
        //int[] a =new int [10];// le estoy reservando espacio de memoria de 10;
        //int []b;//no estamos resevando espacio en la memoria para B;
       // System.out.println(a[4]);
         int [][] tablero =new int [8][8];
         Scanner teclado= new Scanner(System.in);
         tablero[0][0]=4; 
        //si tenemos  array  dos dimensiones hacemos dos bucles.uno para filas i otro para columnas 
        for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
         tablero[i][j]=teclado.nextInt();
         }
        }
        int suma=0;
        for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            suma=suma+tablero[i][j];
        }
        }
     //para hacer la suma hacemos esto:
        for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            if(i==0){
               System.out.println(tablero[i][j]);
            }
        }
        }
     }
}

