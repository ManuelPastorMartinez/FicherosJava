import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("En que carpeta quieres crear el archivo:");
        File directorio = new File(teclado.next());
        if (directorio.mkdir())  System.out.println("Directorio creado");
        else  System.out.println("No se pudo crear el directorio");

        System.out.print("Cuantos archivos quieres crear:");
        int cantidad = teclado.nextInt();

        System.out.println("Como se va a llamar el archivo");
        String nombre = teclado.next();

        for(int i = 0; i < cantidad; i++){
            try {
                File archivo = new File(directorio.toString() + "/"+nombre+"("+i+")"+".txt");
                if (archivo.createNewFile())  System.out.println("Archivo creado");
                else  System.out.println("El archivo ya existe");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
