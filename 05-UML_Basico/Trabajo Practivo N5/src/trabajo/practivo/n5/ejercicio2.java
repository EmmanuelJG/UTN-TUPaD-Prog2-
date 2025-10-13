package javaapp.TP5;

public class ejercicio2 {
    
    public class Celular{
        private int imei;
        private String marca;
        private String modelo;
        private Usuario usuario;
        private Bateria bateria;

        public Celular(int imei, String marca, String modelo, Usuario usuario, 
                Bateria bateria) {
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
            this.usuario = usuario;
            this.bateria = bateria;
        }
    };
    
    public class Bateria{
        private String modelo;
        private String capacidad;

        public Bateria(String modelo, String capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }
    }
    
    public class Usuario{
        private String nombre;
        private int dni;
        private Celular celular;

        public Usuario(String nombre, int dni, Celular celular) {
            this.nombre = nombre;
            this.dni = dni;
            this.celular = celular;
        }
    }

}
