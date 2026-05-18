import java.io.*;
import java.util.Scanner;

public class Ejercicio6 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/datos.txt"));
        buscarPalabra(lector);
    }

    public static void buscarPalabra(BufferedReader lector) {
        try {
            String linea;

            System.out.println("Que palabra quieres buscar");
            String palabra = teclado.nextLine();
            int contador=0;
            while ((linea = lector.readLine()) != null) {
                if (linea.contains(palabra)) {
                    System.out.println(palabra);
                    contador++;
                }

            }

            System.out.println("La palabra "+palabra+" aparece "+contador+" veces");

            lector.close();


        } catch (IOException e) {
            System.out.println(e.getStackTrace());
            throw new RuntimeException(e);
        }
    }

}
