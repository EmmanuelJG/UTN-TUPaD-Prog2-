/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n4;

import java.util.Scanner;

/**
 *
 * @author AMD-PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Trabajo Práctico #4 -  POO ");
        
        Empleado e1 = new Empleado(1, "Federico Garcia", "Developer", 2000.0);
        Empleado e2 = new Empleado("Carolina Herrera", "UX-UI");
        Empleado e3 = new Empleado("Ezequiel Bengolea", "TeachLeader");
        Empleado e4 = new Empleado();
        
        System.out.println("Ingresa los datos de un empleado:");
        e4.setId(12);
        e4.setNombre(scanner.nextLine());
        e4.setPuesto(scanner.nextLine());
        e4.setSalario(scanner.nextDouble());
        
        e1.actualizarSalario(0.10); //Se aplica un 10% de aumento
        e2.actualizarSalario(500);

        System.out.println("Empleados: ");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        System.out.println("Total de empleados: "+ Empleado.getTotalEmpleados());
    }
}
