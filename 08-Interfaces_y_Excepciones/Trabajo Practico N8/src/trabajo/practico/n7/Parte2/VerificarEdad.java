/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n7.Parte2;

/**
 *
 * @author AMD-PC
 */
import java.util.Scanner;

public class VerificarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();

            verificarEdad(edad);
            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad ingresada no es válida (debe estar entre 0 y 120).");
        }
    }
}

