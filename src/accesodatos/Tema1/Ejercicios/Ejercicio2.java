package accesodatos.Tema1.Ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Esta clase esta orientada a dar informacion de un listado de ficheros de una ruta preespecificada, dando informacion de
 * nombre, permisos de escritura, si e archivo esta oculto y su tama�no en bytes.
 */
public class Ejercicio2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();
        File carpeta = new File(ruta);
        File[] archivos = carpeta.listFiles();
        if (carpeta.exists()) {
            if (carpeta.isDirectory()) {
                for (File archivoActual : archivos) {
                    if (archivoActual.isFile()) {
                        System.out.println(archivoActual.getName());
                        if (archivoActual.canWrite()) {
                            System.out.println("el archivo tiene permisos de escritura");
                        } else {
                            System.out.println("el archivo no tiene permisos de escritura");
                        }
                        if (archivoActual.isHidden()) {
                            System.out.println("El archivo esta oculto");
                        } else {
                            System.out.println("El archivo no esta oculto");
                        }
                        System.out.println(archivoActual.length() + " bytes \n");
                    } else {
                        System.out.println(archivoActual.getName() + " es una carpeta \n");
                    }
                }
            }
        } else {
            System.out.println("Esta carpeta no existe, sera creada.");
            if (carpeta.mkdir()) {
                System.out.println("la carpeta asido creada");
            } else {
                System.out.println("la carpeta no ha sido creada");
            }
        }
    }
}
