/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Ruben Condoy
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 2;
        int contador = 3;
        int contador_dos = 1;
        String mensaje= "";
        
        do{

            mensaje= mensaje + numero+"\n";
            numero = numero+contador;
            contador = contador +2;
            contador_dos = contador_dos +1;


        }while(contador_dos <=10 );
        System.out.println(""+mensaje);
    }
    
}
