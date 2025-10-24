/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n7.Parte2;

import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            String entrada = sc.nextLine();

            int numero = Integer.parseInt(entrada);
            System.out.println("Número ingresado correctamente: " + numero);

        } catch (NumberFormatException e) {
            System.err.println("Error: El valor ingresado no es un número entero válido.");
        } finally {
            sc.close();
        }
    }
}
