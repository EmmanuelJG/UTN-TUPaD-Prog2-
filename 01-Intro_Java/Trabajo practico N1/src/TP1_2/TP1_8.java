/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1_2;
import java.util.Scanner;
/**
 *
 * @author AMD-PC
 */
public class TP1_8 {
   public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa dos números enteros: ");
        System.out.println("Primer número: ");
        int one = scanner.nextInt();
        System.out.println("Segundo número: ");
        int two = scanner.nextInt();
        double three = (double) one / (double) two;
        System.out.println("- Resultado en entero: "+ (one / two));
        System.out.println("- Resultado en flotante: "+ three );

   
   }
}