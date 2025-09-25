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
public class TP2_EJ13 {
    public static void main(String[] args) {
        System.out.println("-- LISTA DE PRECIOS --");
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Lista de precios: ");
        imprimirRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("Lista de precios modificados: ");
        imprimirRecursivo(precios, 0);
    }
    
    public static void imprimirRecursivo(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirRecursivo(precios, indice + 1);
        }
    }
}
