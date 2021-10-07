/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accesodatos.Tema1.Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Manuel
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     char [] array = new char[100000];
        try {
            FileReader file = new FileReader("E:\\Ejercicio5.java");
            BufferedReader buffer = new BufferedReader(file);
            
            buffer.skip(1000);
            buffer.read(array);
            System.out.println(array);
            buffer.close();
            
        } catch (Exception e) {
        }
    }
    
}
