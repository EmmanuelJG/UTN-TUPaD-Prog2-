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
public class TP2_EJ12 {
    public static void main(String[] args) {
        System.out.println("-- LISTA DE PRECIOS --");
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Lista de precios: ");
        mostrarPrecios(precios);
        precios[2] = 129.99;
        System.out.println("Lista de precios modificados: ");
        mostrarPrecios(precios);
    }
    
    public static void mostrarPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
