package Exercise03;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad:");
        edad = teclado.nextInt();
        
        if (edad > 18) {
            System.out.println("Eres mayor de edad... ¡Felicidades!");
            
            if  (edad >= 50) {
                System.out.println("Y también de la Generación X, ¡Wow!");
            } else if (edad >=40) {
                System.out.println("Y también de la Generación Y, ¡Wow!"); 
            } else {
                System.out.println("Y también de la Generación Z, ¡Wow!");
            }
        } else if (edad == 18) {
            System.out.println("¡Tienes exactamente 18 años!");
        } else {
            System.out.println("No eres mayor de edad. Lo lamento :'(");
        }
    }
}
