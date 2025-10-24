/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n7.Parte1;

/**
 *
 * @author AMD-PC
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificarCambioEstado(nuevoEstado);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("Pedido:");
        for (Producto p : productos) {
            System.out.println(" - " + p);
        }
        System.out.println("Total: $" + calcularTotal());
        System.out.println("Estado: " + estado);
    }
}

