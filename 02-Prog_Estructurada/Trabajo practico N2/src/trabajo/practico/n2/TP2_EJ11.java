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
public class TP2_EJ11 {
     static double descuento = 0.10;
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;
        System.out.println("-- VARIABLE GLOBAL --");
        System.out.println("Ingresa el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.println("El precio con descuento es $"+ 
                (precio - calcularDescuentoEspecial(precio)));
    }
    
    public static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * descuento;
        System.out.println("El descuento aplicado es del "+ descuentoAplicado + "%");
        return descuentoAplicado;
    }
}
