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
public class TP2_EJ3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("-- CLASIFICACIÓN DE EDAD --");
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        if (edad > 0 && edad < 12){
            System.out.println("Eres un/a Niño/a");
        } else if (edad >= 12 && edad <= 17){
            System.out.println("Eres Adolescente");
        } else if ( edad >= 18 && edad <= 59){
            System.out.println("Sos Adulto/a");
        } else {
            System.out.println("Eres un/a Adulto/a mayor");
        }
     
    }
}
