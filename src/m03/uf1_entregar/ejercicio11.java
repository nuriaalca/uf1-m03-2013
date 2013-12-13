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
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un valor de n") //manera for//
       int suma = 0;
        int n;
        n = teclado.nextInt();
        for (int i = 0; i <= 2 * n; i++) {
            if (i % 2 == 0) {
                suma += i 
            }
        }
        System.out.println("la suma de los " + n + "primeros pares es:" + suma);
    }
        
                
