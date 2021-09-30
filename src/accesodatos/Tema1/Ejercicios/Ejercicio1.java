package accesodatos.Tema1.Ejercicios;

import java.io.File;
import java.util.Scanner;

/**
 * @author Carlos
 *
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        boolean comp = false;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Escriba una ruta:");
            File ruta = new File(entrada.nextLine());
            if (ruta.getName().endsWith("txt") && ruta.isFile()) {
                if (ruta.getName().length() - 4 >= 5) {
                    System.out.println("El Archivo es correcto");
                    comp = true;
                } else {
                    System.out.println("El archivo no es correcto");
                }
                if (ruta.isDirectory()) {
                    System.out.println("La ruta no es correcta");
                    comp = false;
                }
            } else {
                System.out.println("La ruta no es correcta");
            }
        } while (!comp);
        entrada.close();
    }

}
