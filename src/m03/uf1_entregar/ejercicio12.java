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
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //for//
        System.out.println("introduce dos valores");
        int n1;
        int n2;
        int suma =0;
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        //for (int cnt=n1;cnt<n2+1;cnt++){
        //suma =suma + cnt;

        //while//
    while(n1<=n2){
    suma+=n1;
    n1++; 
    }
    //do while//

    System.out.println ("la suma de todo"+suma);


    }
}
