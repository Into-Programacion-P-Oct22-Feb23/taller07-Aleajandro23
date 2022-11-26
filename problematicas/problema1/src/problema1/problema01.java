
package problema1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ruben condoy
 */
public class problema01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        int edad;
        double estatura;
        boolean bandera = true;
        String salir;
        // variable acumuladoras
        int sumaEdades = 0;
        double sumaEstatura = 0;
        // contador 
        int contador = 0;
        // variables para promedio
        double promedioEdad;
        double promedioEstatura;
        String edades = "";
       
        
        
        
        cadenaReporte = String.format("%s%s\n", cadenaReporte, 
                "Listado de Jugadores");
        
         do{
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la  estatura del jugador: ");
            estatura = entrada.nextDouble();           
           
            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura;
           
            contador = contador + 1; // primera(0+1=1)
            
           
            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d,"
                    + "estatura %.2f\n",
                    cadenaReporte,
                    contador,
                    nombreJugador,
                    posicionCampo,
                    edad, 
                    estatura);
            
            edades = edades + edad + "\n"; 
                    
            entrada.nextLine(); //
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        }while(bandera);
        
        promedioEdad = (double)sumaEdades/contador;
        promedioEstatura = sumaEstatura /contador;
        
        cadenaReporte = String.format("%sListado de edades\n%sPromedio de edades: %.2f\n"
                + "Promedio estatura%.2f\n", 
                cadenaReporte, edades, promedioEdad, promedioEstatura);
        
        
        System.out.printf("%s\n", cadenaReporte);
        
    }
}
 
