package exercise01;

public class HelloWorld {

    public static void main(String[] args) {
    
        int edadUsuario = 66;
        double estaturaUsuario = 1.63;
        boolean tieneCarneUsuario = false;
        char letraFavoritaUsuario = 'S';
        String direccionUsuario = "Ourense";
        long numeroFavoritoUsuario = 2147483648L;
        
        System.out.println("Hello World!");
        System.out.println("Los datos del usuario son los siguientes:");
        System.out.println("Edad: " + edadUsuario);
        System.out.println("Estatura: " + estaturaUsuario);
        System.out.println("Carné: " + tieneCarneUsuario);
        System.out.println("Dirección: " + direccionUsuario);
        System.out.println("Letra favorita: " + letraFavoritaUsuario);
        System.out.println("Número favorito: " + numeroFavoritoUsuario);
    }
    
}
