package accesodatos.Tema1.Ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();
        File carpeta = new File(ruta);
        File[] archivos = carpeta.listFiles();
        if (carpeta.exists()) {
            if (carpeta.isDirectory()) {
                for (File archivoActual : archivos) {
                    if (archivoActual.isFile()) {
                        if (System.currentTimeMillis() - archivoActual.lastModified() <= 864000000) {
                            System.out.println(archivoActual.getName());
                            if (archivoActual.setReadOnly()) {
                                System.out.println("El archivo " + archivoActual.getName() + " se ha modificado a solo lectura");
                            } else {
                                System.out.println("El archivo " + archivoActual.getName() + " no se ha modificado a solo lectura");
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("La carpeta no existe");
        }
    }
}
