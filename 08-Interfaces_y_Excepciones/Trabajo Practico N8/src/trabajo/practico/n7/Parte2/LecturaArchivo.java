/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n7.Parte2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese la ruta o el nombre del archivo a leer: ");
            String rutaArchivo = sc.nextLine(); // el usuario ingresa el nombre o ruta

            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            System.out.println("\nContenido del archivo:");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.err.println("\nError: El archivo no se encontró. Verifique la ruta ingresada.");
        } finally {
            sc.close();
            System.out.println("\nLectura finalizada.");
        }
    }
}
