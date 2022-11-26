/*
 Problema05 (use do-while)
Generar, imprimir y obtenga el resultado de la serie:
1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15
 */
package problema05;

/**
 *
 * @author Ruben Condoy
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int contador = 1;
        String caracter ="";
        int numero = 1;
        String mensaje = "";

        do{
            if(contador %2 == 0){
                caracter = "+";

            }else{
                caracter = "-";

            }
            
        mensaje = mensaje + caracter +" " +"1/"+ numero +" " ;
        contador = contador +1;
        numero= numero +1;


        }while(contador <= 10); 
        System.out.println("1 " +mensaje);
    }
     
    
}
