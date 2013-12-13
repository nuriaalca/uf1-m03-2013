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
public class ejercicio {
    public static  int TAMANY=10;//crear una constante
    public static void main(String[] args) {
    Scanner teclado=new Scanner (System.in);
        int [] datos=new int [TAMANY];
    int data=teclado.nextInt();
    int i=0;
    while(data !=-1){ //mientras data es diferente de -1 
        datos[i]=data;
        i++;
        data=teclado.nextInt();
    }
    int suma=datos[0];// se introduce a hacer la media
    int min=datos[0];
    int max=datos[0];
        for(int j=0;j<1;j++) {
        suma=datos[j];
        if(datos[j]< min){
            min=datos[j];
        }
        else if(datos[j]>max){
            max=datos[j];
        }
    }
        int media =suma/i;
        System.out.println("el minim es"+min);
        System.out.println("el maxim es"+max);
        System.out.println("la media es"+media);
    }
    
        
           
}
}
