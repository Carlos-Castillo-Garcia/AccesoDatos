package accesodatos.Tema1.Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        if (!args[0].isEmpty()) {
            String ruta = args[0];
            File archivo = new File(ruta);
            FileInputStream abrirarchivo;
            try {
                abrirarchivo = new FileInputStream(archivo);
                if (abrirarchivo.read() != -1) {
                    int i;
                    while((i = abrirarchivo.read()) != -1){
                        System.out.print((char)i + "");
                    }
                } else {
                    System.out.println("El archivo esta vacio, elija otro.");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Ha de introducir una ruta para que el programa funcione");
        }

    }

}
