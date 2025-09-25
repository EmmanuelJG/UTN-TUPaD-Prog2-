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
public class TP2_EJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- EL MAYOR DE TRES --");
        System.out.println("Ingresá el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresá el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Ingresá el tercer número:");
        int num3 = scanner.nextInt();
        int mayor = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : 
                        ((num2 > num3) ? num2 : num3);
        System.out.println("El número mayor es el "+ mayor );
     
    }
}
