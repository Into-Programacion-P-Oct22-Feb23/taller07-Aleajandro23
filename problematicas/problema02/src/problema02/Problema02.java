/*
2
6
12
20
30
42
56
72
90
110
*/
package problema02;

/**
 *
 * @author Ruben Condoy
 */
public class Problema02 {
    public static void main(String[] args) {
        int numero = 2;
        int contador = 4;
        int contador2 = 1;
        String mensaje= "";
        
        while(contador2 <= 10){

            mensaje= mensaje + numero+"\n";
            numero = numero +contador;
            contador = contador +2;
            contador2 = contador2 +1;


        }
        System.out.println(""+mensaje);
        
                
    }
}
 
    
    
    
    
    
    
    
    
    
//numero = 2 ----- 
// contador = 4------
// contador <= 110 ----- 4 <= 110 si v
// pantalla: 4