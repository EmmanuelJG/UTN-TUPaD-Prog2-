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
public class TP2_EJ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        System.out.println("-- VALIDACIÓN DE NOTA --");
        do{
            System.out.println("Ingresa una nota entre 0 y 10: ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10){
                System.out.println("Error: Nota inválida.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada");
     
    }
}
