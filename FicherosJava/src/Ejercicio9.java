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
        File archivoTemp = new File(directorio.toString()+"/"+nombre+"Temp.txt");

        try{
            archivoTemp.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(archivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoTemp))) {


            String linea;

            while ((linea = reader.readLine()) != null) {
                String nuevaLinea = convertirLinea(linea);
                writer.write(nuevaLinea);
                writer.newLine(); // Preservar los saltos de línea
            }

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

    public static String convertirLinea(String linea) {
        String palabras[] = linea.split(" ");
        String palabrasFinal = "";

        for (int i = 0; i < palabras.length; i++) {
            palabrasFinal+=palabraMayus(palabras[i]);
            palabrasFinal+=" ";
        }
        return palabrasFinal;
    }

    public static String palabraMayus(String palabra){
        return Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1).toLowerCase();
    }
}
