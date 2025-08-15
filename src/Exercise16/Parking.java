package Exercise16;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {

        int tipoParking, cantHoras, precioHora = 3, precioJornada = 30;
        int cantPorHora = 0, cantMediaJornada = 0, cantJornada = 0;
        double total, descuento, totalAcum = 0;
        String matricula = "";
        Scanner teclado = new Scanner(System.in);

        while (!matricula.equalsIgnoreCase("fin")) {
            System.out.println("Ingresa la matrícula de tu coche:");
            matricula = teclado.nextLine();

            if (!matricula.equalsIgnoreCase("fin")) {

                System.out.println("Ingresa el tipo de parking donde se encuentra tu coche:");
                System.out.println("1 - Por hora");
                System.out.println("2 - Media jornada");
                System.out.println("3 - Jornada completa");
                teclado = new Scanner(System.in);

                if (!teclado.hasNextInt()) {
                    System.out.println("No ingresaste una de las opciones válidas.\n");
                } else {
                    tipoParking = teclado.nextInt();
                    if (tipoParking < 1 && tipoParking > 3) {
                        System.out.println("No ingresaste una de las opciones válidas.\n");
                    } else {
                        if (tipoParking == 1) {
                            System.out.println("Modalidad 'por hora'");
                            System.out.println("¿Durante cuántas horas quieres aparcar tu coche?");
                            cantHoras = teclado.nextInt();
                            total = cantHoras * precioHora;
                            cantPorHora++;
                            totalAcum += total;
                            System.out.println("Monto total: " + total + " EUR");
                        } else if (tipoParking == 2) {
                            System.out.println("Modalidad 'media jornada' (incluye 5% de descuento)");
                            descuento = precioJornada / 2 * 0.05;
                            total = precioJornada / 2 - descuento;
                            cantMediaJornada++;
                            totalAcum += total;
                            System.out.println("Monto total: " + total + " EUR");
                        } else if (tipoParking == 3) {
                            System.out.println("Modalidad 'jornada completa' (incluye 10% de descuento)");
                            descuento = precioJornada * 0.10;
                            total = precioJornada - descuento;
                            cantJornada++;
                            totalAcum += total;
                            System.out.println("Monto total: " + total + " EUR");
                        }
                        System.out.println("***** Transacción completada *****\n");
                    }
                }
            }
            teclado = new Scanner(System.in);
        }
        System.out.println(
                "==================================================");
        System.out.println(
                "***** Datos totales *****");
        System.out.println(
                "Parkings por hora: " + cantPorHora);
        System.out.println(
                "Parkings por media jornada: " + cantMediaJornada);
        System.out.println(
                "Parkings por jornada completa: " + cantJornada);
        System.out.println(
                "Ingresos recaudados durante el día: " + totalAcum + " EUR");
    }
}

/* Quitar el renew de scanner duplicado y el conttinue */
