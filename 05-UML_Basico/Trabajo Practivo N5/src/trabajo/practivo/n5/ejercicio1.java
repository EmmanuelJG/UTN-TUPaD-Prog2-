package javaapp.TP5;
import java.util.Date;

public class ejercicio1 {
    
    public class Pasaporte{
        private int numero;
        private Date fechaEmision;
        private Titular titular;
        private Foto foto;

        public Pasaporte(int numero, Date fechaEmision, Titular titular, Foto foto) {
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.titular = titular;
            this.foto = foto;
        }
    };
    
    
    public class Foto{
        private String imagen;
        private String formato;

        public Foto(String imagen, String formato) {
            this.imagen = imagen;
            this.formato = formato;
        }
    }
    
    public class Titular{
        private String nombre;
        private int dni;
        private Pasaporte pasaporte;

        public Titular(String nombre, int dni, Pasaporte pasaporte) {
            this.nombre = nombre;
            this.dni = dni;
            this.pasaporte = pasaporte;
        }
    }

}
