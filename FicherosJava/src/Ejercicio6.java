import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        try {

            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/datos.txt"));
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
