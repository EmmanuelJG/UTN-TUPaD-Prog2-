
package javaapp.TP5;
import java.util.Date;

public class ejercicio10 {

    public class CuentaBancaria{
        private int cbu;
        private double saldo;
        private Titular titular;
        private ClaveSeguridad claveSeguridad;

        public CuentaBancaria(int cbu, double saldo, Titular titular, ClaveSeguridad claveSeguridad) {
            this.cbu = cbu;
            this.saldo = saldo;
            this.titular = titular;
            this.claveSeguridad = claveSeguridad;
        }
    }
    
    public class Titular{
        private String nombre;
        private int dni;

        public Titular(String nombre, int dni) {
            this.nombre = nombre;
            this.dni = dni;
        } 
    }
    
    public class ClaveSeguridad{
        private int codigo;
        private Date ultimaModificacion;

        public ClaveSeguridad(int codigo, Date ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }
    }
}
