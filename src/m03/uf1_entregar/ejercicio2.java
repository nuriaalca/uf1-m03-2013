/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1_entregar;

import java.util.Random;

/**
 *
 * @author Pedro
 */
public class ejercicio2 {
    public static void main(String[] args {
        Random aleatorio = new Random();
        int[] vector =new int[15];
        int n = aleatorio.nextInt(15);
        int i;
        for (int cnt=0; cnt< 15; cnt++) {
            vector[cnt]=aleatorio.nextInt(100);
        }
        int suma = 0;
        for (int cnt=0; cnt < n; cnt++) {
            suma = suma + cnt;
            System.out.println("vector es"+vector[cnt]);
        }
        System.out.println("la suma total es"+suma);
    }
}