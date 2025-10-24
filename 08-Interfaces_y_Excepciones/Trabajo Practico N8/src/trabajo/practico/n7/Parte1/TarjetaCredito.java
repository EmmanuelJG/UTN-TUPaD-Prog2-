/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n7.Parte1;

/**
 *
 * @author AMD-PC
 */
public class TarjetaCredito implements PagoConDescuento {
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de crédito a nombre de " + titular + ": $" + monto);
    }
}

