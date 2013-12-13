/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1_ejemplos;

/**
 *
 * @author Pedro
 */
public class explicacion_array {
public static void main (String [] args){
    int[] arrayA = new int [5];   //estamos definiendo arrays de enteros, los 3 arrays guardan 5 enteros
        int[] arrayB = {1, 3, 4, 1, 4};  // vamos a darles valores al array B con llaves. El uso de llaves solo esta permitido en la inicializacion
        int[] arrayC = new int [5];
        
        //vamos a darles valores al array A uno por uno
        
        arrayA[0] = 2; // array a en la posición 0 vamos a guardar un 2
        arrayA[1] = 4;
        arrayA[2] = 3;
        arrayA[3] = 3;
        arrayA[4] = -1;
       
        int n; // declaro esta variable para poder hacer la suma de abajo, esta suma se puede hacer porque estamos
         //sumando dos enteros. 
        n = arrayA[3] + arrayB[0];
        
        
        /*quiero imprimir el array A en la posicion 3*/ 
//        System.out.println (arrayA[3]);
        
    
        /*mostrar elementos del array A, como sabemos cuantos elementos tiene, lo hacemos con un FOR*/      
//        for (int i=0; i<5; i++)
//        {
//            System.out.println (arrayA[i]);
//        }
        
        
        //hacer suma del array A con el array B
        
//        for (int i=0; i<5; i++){
//            System.out.println (arrayA[i]+ arrayB [i]);
//        
//        int n;
//        for (i=0; i<5; i++){
//            
//            System.out.println ( n= arrayA[i] + arrayB[i]);
//        }
//    }
//    }
// imprimir cuanto vale la suma total de los elementos del array A.
//        int suma = 0;
//        for (int i=0; i<5; i++){
//            suma= suma + arrayA[i]; // suma va aser igual a lo q valia + array A 
//            
//        }
//        System.out.println (suma);
//        
//    }
//}

// hacer programa q multiplique todos los valores de un array por 4. 
        
//        for (int i=0; i<5; i++){
//            System.out.println (arrayA[i]*4);
//            
//        }
//        
//        
//    }
//}
        
// imprimir array A al reves. (for)        
//        
//          for (int i=arrayA.length -1; i>=0; i--){
//            System.out.println (arrayA[i]);
//            
//        }
//        
//        
//    }
//}   

/*imprimir array A al reves. (while)*/       
//        int i = arrayA.length - 1;
//        while (i >= 0) {
//            System.out.println(arrayA[i]);
//            i--;
//        }
//    }
//}

        
/*imprimir array A al reves. (do while)*/       
        int i = arrayA.length - 1;
        do {
            System.out.println(arrayA[i]);
            i--;
        } while (i >= 0);


    }
}
        
  
        
  
