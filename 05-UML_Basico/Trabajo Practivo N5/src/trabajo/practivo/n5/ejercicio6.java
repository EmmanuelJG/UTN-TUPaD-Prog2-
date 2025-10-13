
package javaapp.TP5;
import java.util.Date;

public class ejercicio6 {

    public class Reserva{
        private Date fecha, hora;
        private Cliente cliente;
        private Mesa mesa;

        public Reserva(Date fecha, Date hora, Cliente cliente, Mesa mesa) {
            this.fecha = fecha;
            this.hora = hora;
            this.cliente = cliente;
            this.mesa = mesa;
        }
    }
    
    public class Cliente{
        private String nombre;
        private int dni;

        public Cliente(String nombre, int dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
    }
    
    public class Mesa{
        private int numero, capacidad;

        public Mesa(int numero, int capacidad) {
            this.numero = numero;
            this.capacidad = capacidad;
        }
    }
}
