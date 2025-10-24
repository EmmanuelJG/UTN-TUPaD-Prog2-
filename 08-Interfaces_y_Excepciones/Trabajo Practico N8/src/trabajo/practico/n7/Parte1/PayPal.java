/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n7.Parte1;

/**
 *
 * @author AMD-PC
 */
public class PayPal implements Pago {
    private String usuario;

    public PayPal(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado por PayPal del usuario " + usuario + ": $" + monto);
    }
}

