package Exercise07;

import java.util.Scanner;

public class NotionsStore {

    public static void main(String[] args) {

        // Mercería mayorista --> Vende al mayor
        // Menos de 5 paquetes no vende
        // Entre 5 y 15 sale 10 USD el envío 
        // Más de 15 el envío es gratis
        int cantidadPaquetes, costoEnvio = 0;
        double montoTotal, diferencia, descuento, montoConDesc;
        double precioPaquete = 10;
        Scanner teclado = new Scanner(System.in);

        // Preguntar por teclado cuantos paquetes son
        System.out.println("***** Bienvenida a nuestra tienda *****");
        System.out.println("El costo de cada paquete es de 10 USD");
        System.out.println("Ingrese el número de paquetes que desea comprar:");
        cantidadPaquetes = teclado.nextInt();

        // Evaluar los posible casos
        if (cantidadPaquetes < 5 && cantidadPaquetes > 1) {
            System.out.println("No se permiten compras menores a 5 paquetes.");
        } else if (cantidadPaquetes < 1) {
            System.out.println("No ingresaste una cantidad válida.");
        } else {    
            montoTotal = cantidadPaquetes * precioPaquete;

            if (cantidadPaquetes <= 15) {
                costoEnvio = 10;
                montoTotal += costoEnvio;
                System.out.println("Pedido cargado - El monto total es de: " + montoTotal + " USD. Que incluye un costo de envío de 10 USD.");
            } else {
                System.out.println("¡Felicidades! Su envío es gratis.");
            }
            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("Además, el monto total es menor a 100 USD por lo que no posee promociones. Si aumenta en " + diferencia + " USD su compra obtendrá un 5% de descuento.");
            } else if (montoTotal < 300) {
                descuento = montoTotal * 0.05;
                montoConDesc = montoTotal - descuento;
                System.out.println("Además, la suma de sus compras es mayor a 100 USD por lo que cuenta con un 5% de descuento, el monto con descuento le quedaría en: " + montoConDesc + " USD.");
            } else {
                descuento = montoTotal * 0.10;
                montoConDesc = montoTotal - descuento;
                System.out.println("Además, la suma de sus compras es mayor a 300 USD por lo que cuenta con un 10% de descuento, el monto con descuento le quedaría en: " + montoConDesc + " USD.");
            }
        }
    }
}
