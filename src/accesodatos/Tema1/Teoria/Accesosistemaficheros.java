/**
 *
 */
package accesodatos.Tema1.Teoria;

import java.io.File;

/**
 * @author Carlos
 *
 */
public class Accesosistemaficheros {

    public static void main(String[] args) {
        File carpeta1 = new File("C:\\Users\\Carlos\\Desktop\\3-Varios (192.168.1.50) - Acceso directo");
        File[] listacarpetas = carpeta1.listFiles();

        System.out.println(carpeta1.getName());

        for (int i = 0; i < listacarpetas.length; i++) {
            if (listacarpetas[i].isDirectory()) {
                System.out.print("--");
            }
            if (listacarpetas[i].getName().endsWith("txt")) {
                System.out.print("-txt-");
            }
            System.out.println(listacarpetas[i].getName());
        }
    }
}
