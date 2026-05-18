import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File archivo = new File("src/main/resources/prueba.txt"); // archivo es una referencia a un objeto de tipo File.
//No crea físicamente el archivo prueba.txt aún, sólo representa una ruta (relativa o absoluta) en el sistema de archivos.

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo " + archivo.getName() + " ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ha habido algún problema.");
            e.printStackTrace();
        }

    }
}