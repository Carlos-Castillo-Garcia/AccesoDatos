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
		// TODO Auto-generated method stub
		File carpeta1= new File("C:\\Users\\Carlos\\Desktop\\instaladores_portatil");
		File[] listacarpetas= carpeta1.listFiles();
		
		System.out.println(carpeta1.getName());
		
		for(int i=0; i<listacarpetas.length; i++) {
			if(listacarpetas[i].isDirectory()) {
				System.out.print("--");
			}
			if(listacarpetas[i].getName().endsWith("txt")) {
				System.out.print("-txt-");
			}
			System.out.println(listacarpetas[i].getName());
		}
	}
}
