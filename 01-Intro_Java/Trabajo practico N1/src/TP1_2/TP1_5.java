/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1_2;

import java.util.Scanner;

public class TP1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa dos números: ");
        System.out.println("Primer número: ");
        int primNumero = scanner.nextInt();
        System.out.println("Segundo número: ");
        int segNumero = scanner.nextInt();
        System.out.println("Suma: "+ (primNumero + segNumero));
        System.out.println("Resta: "+ (primNumero - segNumero));
        System.out.println("Multiplicación: "+ (primNumero * segNumero));
        System.out.println("División: "+ (primNumero / segNumero));
    }
    
}
