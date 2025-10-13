
package javaapp.TP5;

public class ejercicio11 {

    public class Artista{
        private String nombre, genero;

        public Artista(String nombre, String genero) {
            this.nombre = nombre;
            this.genero = genero;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }
        
    }
    
    public class Cancion{
        private String titulo;
        private Artista artista;

        public Cancion(String titulo, Artista artista) {
            this.titulo = titulo;
            this.artista = artista;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Artista getArtista() {
            return artista;
        }

        public void setArtista(Artista artista) {
            this.artista = artista;
        }
        
        
    }
    
    public class Reproductor{
        
        public void reproducir(Cancion cancion){
            cancion.getTitulo();
            System.out.println("Reproduciendo el titulo: "+ cancion.getTitulo());
        }
    }
}
