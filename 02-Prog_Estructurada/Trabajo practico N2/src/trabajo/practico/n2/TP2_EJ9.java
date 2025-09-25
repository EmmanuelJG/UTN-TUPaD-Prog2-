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
public class TP2_EJ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, precio;
        String zona;
        System.out.println("-- LOGÍSTICA DE PAQUETES --");
        System.out.println("Ingresa el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.println("Ingresa el peso del producto en kg: ");
        peso = scanner.nextDouble();
        System.out.println("Ingresa la zona del envio (Nacional / Internacional): ");
        scanner.nextLine();
        zona = scanner.nextLine();
        calcularTotalCompra(precio, peso, zona);
    }
    
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio = zona.equalsIgnoreCase("nacional") ? 5 : 10;
        return costoEnvio * peso;
    }
    
    public static void calcularTotalCompra(double precio, double peso, String zona){
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo del envio es $" + (costoEnvio));
        System.out.println("El precio total es $"+ (costoEnvio+precio));
    }
}
