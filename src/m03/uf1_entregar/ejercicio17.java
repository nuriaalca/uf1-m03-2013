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
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usuari;
        usuari=teclado.nextInt();
        int positiu=0;
        int negatiu=0;
        while (usuari !=0){
            if(usuari>0){
            positiu++;
            }
            if(usuari<0){
            negatiu++;
            }
            usuari=teclado.nextInt();
        }
        System.out.println("positiu"+positiu);8
        System.out.println("negatiu"+negatiu);
        
}
