import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio7 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        File archivo = new File("src/main/resources/datos.txt");
        leerFichero(archivo);
    }
    public static void leerFichero(File archivo){
        try {
            Scanner lector = new Scanner(archivo);

            System.out.println("Que palabra quieres buscar");
            String palabra = teclado.nextLine();
            int contador = 0;
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println("Línea: " + linea);
                if (linea.contains(palabra)) {
                    contador++;
                }
            }

            System.out.println("La palabra "+palabra+" aparece "+contador+" veces");


            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }
    }
}