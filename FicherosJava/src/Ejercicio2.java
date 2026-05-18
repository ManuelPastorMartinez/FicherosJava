import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        File fichero = new File("src/main/resources/ejemplo1.txt");
        if(fichero.exists()) System.out.println("El fichero " + fichero.getName() + " existe");
        else System.out.println("El fichero " + fichero.getName() + " no existe");
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Longitud: " + fichero.length());
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());

        // ejemplo carpeta
        File carpeta = new File("src/main/resources");
        if(carpeta.exists()) System.out.println("La carpeta " + carpeta.getName() + " existe");
        else System.out.println("La carpeta " + carpeta.getName() + " no existe");
        System.out.println("Nombre: " + carpeta.getName());
        System.out.println("Longitud: " + carpeta.length());
        System.out.println("Ruta absoluta: " + carpeta.getAbsolutePath());
    }
}
