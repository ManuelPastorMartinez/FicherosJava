import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        try(Scanner archivo1 = new Scanner(new File("src/main/resources/datos.txt"));
            Scanner archivo2 = new Scanner(new File("src/main/resources/prueba_escribir(1).txt"));
            PrintWriter escribir = new PrintWriter(new File("src/main/resources/archivoCombinado.txt"))
        ) {

            while (archivo1.hasNext() && archivo2.hasNext()) {
                escribir.print(archivo1.next() + " ");
                escribir.print(archivo2.next() + " ");
            }

            while (archivo1.hasNext()) {
                escribir.print(archivo1.next() + " ");
            }

            while (archivo2.hasNext()) {
                escribir.print(archivo2.next() + " ");
            }
        } catch (IOException e) {
            System.out.println("Ha habido algún problema.");
            e.printStackTrace();
        }
    }
}
