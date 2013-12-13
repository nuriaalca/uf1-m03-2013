/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1_entregar;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[14];
        int i;
        System.out.println("introduce numeros positivos i negativos");
        for (i = 0; i < 14; i++) {
            numeros[i] = teclado.nextInt();
            System.out.println("el cuadrado es"+Math.pow(i,2)+ "el cubo es"+Math.pow(i,3));
        }
        }
    }
