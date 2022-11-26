/*
Problema04 (use while)
Generar, imprimir y obtenga el resultado de la serie:
1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15
 */
package problema04;

/**
 *
 * @author ruben condoy
 */
public class Problema04 {

  
    public static void main(String[] args) { 
        // TODO code application logic here
        int contador = 1;
        String caracter ="";
        String mensaje = "";
        int numero =1;

        while(contador <=10){
            if(contador %2==0){
                caracter = "+";

            }else{
                caracter = "-";

            }
        mensaje = mensaje + caracter +" " +"1/"+ numero +" " ;
        contador = contador +1;
        numero= numero +1;


        }
        System.out.println("1 "+mensaje);
    }
}
