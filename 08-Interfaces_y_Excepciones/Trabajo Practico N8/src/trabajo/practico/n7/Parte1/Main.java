/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.n7.Parte1;

/**
 *
 * @author AMD-PC
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana López", "ana.lo@gmail.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Laptop", 1500));
        pedido.agregarProducto(new Producto("Mouse", 300));

        pedido.mostrarPedido();

        // Cambiar estado y notificar
        pedido.cambiarEstado("En preparación");

        // Pago con Tarjeta de Crédito (con descuento)
        PagoConDescuento pagoTarjeta = new TarjetaCredito("Ana López");
        double montoConDescuento = pagoTarjeta.aplicarDescuento(pedido.calcularTotal());
        pagoTarjeta.procesarPago(montoConDescuento);

        // Pago con PayPal (sin descuento)
        Pago pagoPayPal = new PayPal("ana.paypal@example.com");
        pagoPayPal.procesarPago(pedido.calcularTotal());
    }
}
