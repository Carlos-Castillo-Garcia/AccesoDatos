package accesodatos.Tema1.Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Programa para el aprendizaje del uso del flujo de Bytes, con un archivo
 * pasado por argumentos
 *
 * @author Manuel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            String ruta = args[0];
            File archivo = new File(ruta);
            FileInputStream abrirarchivo = null;
            try {
                abrirarchivo = new FileInputStream(archivo);
                if (abrirarchivo.read() != -1) {
                    int i;
                    /*
                    * bucle para la lectura del archivo a la vez que la insercion de los bytes en "i" y la escritura
                    * con casting de int a char
                     */
                    while ((i = abrirarchivo.read()) != -1) {
                        System.out.print((char) i + "");
                    }
                } else {
                    System.out.println("\nEl archivo esta vacio, elija otro.");
                }
            } catch (FileNotFoundException ex) {
                System.out.println("\nEl archivo no ha sido encontrado " + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("\nError en la lectura del archivo " + ex.getMessage());
            } finally {
                try {
                    abrirarchivo.close();
                } catch (IOException e) {
                    System.out.println("\nError al cerrar el archivo");
                }
            }
        } else {
            System.out.println("\nHa de introducir una ruta para que el programa funcione");
        }

    }

}
