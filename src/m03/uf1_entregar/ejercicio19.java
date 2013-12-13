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
public class ejercicio19 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("introdueix un numero divisible entre 2");
       int n;
       n=teclado.nextInt();
       int cnt=0;
      if(n>0){
      } while(n%2==0){
        n=n/2;
        cnt=cnt+1;
      }
      System.out.println("es divisible"+ cnt+ "vegades");
      
       }
      
       }
      
