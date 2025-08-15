package Exercise11;

import java.util.Scanner;

public class Numbers100 {

    /* Realizar un programa que dado por teclado un límite numérico (por ejemplo 100) 
    muestre en pantalla todos los números hasta ese límite (empezando por 1). */
    
    public static void main(String[] args) {

        int limite;
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el límite:");
            if (teclado.hasNextInt()) {
                limite = teclado.nextInt();
                break;
            } else {
                System.out.println("Ingresaste un límite incorrecto (debe ser un número entero)");
                teclado.next();
            }
        }
        
        for (int numero = 0; numero < limite; numero++) {
            System.out.println(numero + 1);
        }
    }
}
