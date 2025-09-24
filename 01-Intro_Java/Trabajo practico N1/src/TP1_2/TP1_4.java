/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1_2;

import java.util.Scanner;

public class TP1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tus datos:");

        System.out.print("1. Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.print("2. Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());

        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años de edad");
    }
}