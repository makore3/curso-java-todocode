package Exercise19;

public class Overflow {

    public static void main(String[] args) {
        
       int[] vector = {3, 5, 4};
       
        System.out.println("El valor de la 3ra posición es: " + vector[2]);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Vector: " + vector[i]);
        }
    }

}
