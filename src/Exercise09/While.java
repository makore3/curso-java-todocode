package Exercise09;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        // Ejempl bucle controlado por contador
        /*int contador = 0;

        while (contador < 10) {
            System.out.println("Estoy en la vuelta número: " + contador);
            contador++;
        } */
        
        // Ejemplo bucle controlado por centinela
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        
        while (bandera == true) {
            System.out.println("El valor de mi bandera es: " + bandera);
            System.out.println("¿Estás actualmente suscrito al canal? " + bandera);
            System.out.println("¿Quieres desuscribirte del canal?");
            respuesta = teclado.next();
            
            if (respuesta.equalsIgnoreCase("si")) {
                bandera = false;
            }
        }
    }
}
