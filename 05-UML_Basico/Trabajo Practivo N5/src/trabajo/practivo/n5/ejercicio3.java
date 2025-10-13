
package javaapp.TP5;

public class ejercicio3 {

    public class Libro{
        private String titulo, isbn;
        private Autor autor;
        private Editorial editorial;

        public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
            this.titulo = titulo;
            this.isbn = isbn;
            this.autor = autor;
            this.editorial = editorial;
        }
    }
    
    public class Autor{
        private String nombre, nacionalidad;

        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }
    }
    
    public class Editorial{
        private String nombre, direccion;

        public Editorial(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }
    }
    
}
