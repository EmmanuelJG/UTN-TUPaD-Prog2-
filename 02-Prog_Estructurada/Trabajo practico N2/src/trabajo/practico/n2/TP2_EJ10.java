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
public class TP2_EJ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida;
        System.out.println("-- ACTUALIZAR STOCK --");
        System.out.println("Ingresa el stock actual: ");
        stockActual = scanner.nextInt();
        System.out.println("Ingresa la cantidad vendida: ");
        cantidadVendida = scanner.nextInt();
        System.out.println("Ingresa la cantidad recibida: ");
        cantidadRecibida = scanner.nextInt();
        System.out.println("El nuevo stock del producto es: "+ actualizarStock(
        stockActual, cantidadVendida, cantidadRecibida));
    } 
    
    public static int actualizarStock(
            int stockActual, 
            int cantidadVendida, 
            int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
