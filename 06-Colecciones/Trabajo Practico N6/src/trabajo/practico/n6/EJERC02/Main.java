/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n6.EJERC02;

/**
 *
 * @author AMD-PC
 */
public class Main {
    public static void main(String[] args) {
        // 1️⃣ Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2️⃣ Crear autores
        Autor autor1 = new Autor("A01", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A02", "Julio Cortázar", "Argentina");
        Autor autor3 = new Autor("A03", "Isabel Allende", "Chilena");

        // 3️⃣ Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "Crónica de una muerte anunciada", 1981, autor1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("ISBN004", "La casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("ISBN005", "Paula", 1994, autor3);

        // 4️⃣ Listar todos los libros
        biblioteca.listarLibros();

        // 5️⃣ Buscar un libro por ISBN
        biblioteca.buscarLibroPorIsbn("ISBN003");

        // 6️⃣ Filtrar libros por año de publicación
        biblioteca.filtrarLibrosPorAnio(1994);

        // 7️⃣ Eliminar un libro y volver a listar
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // 8️⃣ Mostrar cantidad total de libros
        System.out.println("\n📖 Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9️⃣ Listar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}

