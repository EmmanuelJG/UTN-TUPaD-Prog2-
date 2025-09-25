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
public class TP2_EJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio, impuesto, descuento;
        System.out.println("-- CALCULAR PRECIO FINAL CON IMP. Y DESC. --");
        System.out.println("Ingresa el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.println("Ingresa el impuesto: ");
        impuesto = scanner.nextDouble();
        System.out.println("Ingresa el descuento: ");
        descuento = scanner.nextDouble();
        System.out.println("Precio final del producto es de $"+ 
                calcularPrecioFinal(precio, impuesto, descuento));
    }
    
    public static double calcularPrecioFinal(
            double precio, 
            double impuesto, 
            double descuento){
        return precio + (precio*(impuesto/100)) - (precio*(descuento/100));
    }
}
