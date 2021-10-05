package accesodatos.Tema1.Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Manuel
<<<<<<< Updated upstream
 * Este es un programa al que se le pasa una ruta como parametro y lee y escribe por pantalla cada una de las lineas del archivo
=======
 * Este programa esta hecho para un archivo por argumento y leer todas la lineas de ese archivo
>>>>>>> Stashed changes
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        String ruta = args[0];
        File archivo = new File(ruta);
        FileReader fr = new FileReader(archivo);
	BufferedReader br = new BufferedReader(fr);
        String texto;

        try {
            if (args.length == 0 || args.length > 1) {
                System.out.println("Los Argumentos no son validos");
            } else {
                while ((texto = br.readLine()) != null) {
                    System.out.println(texto);
                }
                fr.close();
                br.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo pasado como argumento no existe \n"+ex.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Los Argumentos no son validos \n" + e.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
