/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n7.Parte1;

/**
 *
 * @author AMD-PC
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.println("Notificación a " + nombre + " (" + email + "): su pedido está ahora " + nuevoEstado);
    }
}

