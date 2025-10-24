/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n7.Parte2;

/**
 *
 * @author AMD-PC
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaConTryWithResources {
    public static void main(String[] args) {
        String ruta = "texto.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

