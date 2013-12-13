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
public class ejercicio11_2 {
   public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.println("introduce un valor de n")
       //manera while
      int suma=0;
      int i;
      int n;
      n=teclado.nextInt();
      while(i< = 2 * n){
       if(i % 2==0){
        suma+ = i;
        i++;
        }
      }
      
}
