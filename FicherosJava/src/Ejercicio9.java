import java.io.*;
import java.util.Scanner;

public class Ejercicio9 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("A que directorio quieres ir");
        File directorio = new File(teclado.next());
        System.out.println("Que archivo quieres modificar");
        String nombre = teclado.next();
        File archivo = new File(directorio.toString() + "/"+nombre+".txt");
        File archivoTemp = new File(directorio.toString()+"/"+nombre+".txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoTemp));
        } catch (IOException e) {
            System.out.println("Ha habido algún problema.");
            e.printStackTrace();
        }

        // reemplazar el archivo original por el modificado
        if (archivo.delete()) {
            archivoTemp.renameTo(archivo);
            System.out.println("Archivo modificado correctamente.");
        } else {
            System.out.println("No se ha podido reemplazar el archivo original.");
        }
    }
}
