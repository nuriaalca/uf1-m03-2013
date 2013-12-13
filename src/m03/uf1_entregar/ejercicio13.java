/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1_entregar;

/**
 *
 * @author Pedro
 */
public class ejercicio13 {
    public static void main(String[] args) {
        int x = 0;
        int n = 16;
        while (n % 2 == 0) {
            x = x + n;
            n = n / 2;
        }
        System.out.println(x);// el resultat de x=30;
        System.out.println(n); // el resultat de n=1;
        //x=16+8+4+2;
        //16/2=8
        //8/2=4:
        //4/2=2;
        //2/2=1

    
}
    
