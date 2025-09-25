/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.n2;

import java.util.Scanner;

/**
 *
 * @author AMD-PC
 */
public class TrabajoPracticoN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("-- AÑO BISIESTO --");
        System.out.println("Ingresá el número de algun año: ");
        int num = scanner.nextInt();
        if (num%4==0 && num%100!=0 || num%400==0){
            System.out.println("¡El año es bisiesto!");
        } else {
            System.out.println("El año NO es bisiesto.");
        }
     
    }
    
}
