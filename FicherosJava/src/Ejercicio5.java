import java.io.File;

public class Ejercicio5 {
    public static void main(String[] args) {
        String rutaCarpeta = "src/main/resources";
        listarArchivos(rutaCarpeta);
    }
    //método que lista todos los archivos de un carpeta, indicando el tamaño en bytes
    public static void listarArchivos(String rutaCarpeta) {
        File carpeta = new File(rutaCarpeta);
        if (carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();
            if (archivos != null && archivos.length > 0) {
                for (File f : archivos) {
                    if (f.isFile()) {
                        System.out.println(f.getName() + " - " + f.length() + "bytes");
                    }
                }
            }else{
                System.out.println("No se ha encontrado ningún archivo.");
            }
        } else System.err.println("La ruta proporcionada no es una carpeta");
    }
}
