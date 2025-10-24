/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n6.EJERC02;

/**
 *
 * @author AMD-PC
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        System.out.println("\nLibros en la biblioteca \"" + nombre + "\":");
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }

    public void buscarLibroPorIsbn(String isbn) {
        System.out.println("\nBuscando libro con ISBN: " + isbn);
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                libro.mostrarInfo();
                return;
            }
        }
        System.out.println("No se encontró ningún libro con ese ISBN.");
    }

    public void eliminarLibro(String isbn) {
        System.out.println("\n Eliminando libro con ISBN: " + isbn);
        boolean eliminado = libros.removeIf(libro -> libro.getIsbn().equalsIgnoreCase(isbn));
        if (eliminado) {
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("No se encontró el libro con ese ISBN.");
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n Libros publicados en el año " + anio + ":");
        List<Libro> filtrados = libros.stream()
                .filter(l -> l.getAnioPublicacion() == anio)
                .collect(Collectors.toList());

        if (filtrados.isEmpty()) {
            System.out.println("No hay libros publicados en ese año.");
        } else {
            filtrados.forEach(Libro::mostrarInfo);
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\n Autores disponibles en la biblioteca:");
        libros.stream()
                .map(Libro::getAutor)
                .distinct()
                .forEach(autor -> System.out.println("- " + autor.getNombre() + " (" + autor.getNacionalidad() + ")"));
    }
}
