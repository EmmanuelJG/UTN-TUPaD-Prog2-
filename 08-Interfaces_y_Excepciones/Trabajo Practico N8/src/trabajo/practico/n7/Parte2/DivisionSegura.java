/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n7.Parte2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el numerador: ");
            int numerador = sc.nextInt();

            System.out.print("Ingrese el denominador: ");
            int denominador = sc.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar solo números enteros.");
        } finally {
            sc.close();
            System.out.println("Operación finalizada.");
        }
    }
}
