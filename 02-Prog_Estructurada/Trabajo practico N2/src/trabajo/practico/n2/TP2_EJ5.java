/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n2;

import java.util.Scanner;

/**
 *
 * @author AMD-PC
 */
public class TP2_EJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, amount = 0;
        System.out.println("-- SUMA DE NÚMEROS PARES --");
        System.out.println("Ingresa un número, o '0' para finalizar: ");
        num = scanner.nextInt();
        while(num != 0){
            amount += (num % 2 == 0) ? num : 0;
            System.out.println("Ingresa un número");
            num = scanner.nextInt();
        }
        System.out.println("- La suma total de los pares es: " + amount);
     
    }
}
