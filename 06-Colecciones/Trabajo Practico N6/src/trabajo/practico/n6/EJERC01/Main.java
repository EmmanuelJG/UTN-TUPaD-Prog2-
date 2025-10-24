/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.n6.EJERC01;

/**
 *
 * @author AMD-PC
 */
public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // Crear productos
        Producto p1 = new Producto("P01", "Manzana", 500, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P02", "Televisor", 2500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P03", "Campera", 1500, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P04", "Silla", 3000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P05", "Pan", 300, 100, CategoriaProducto.ALIMENTOS);

        // Agregar al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Listar productos
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        inventario.listarProductos();

        // Buscar producto por ID
        System.out.println("\n--- BUSCAR PRODUCTO P03 ---");
        Producto buscado = inventario.buscarProductoPorId("P03");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar por categoria
        System.out.println("\n--- PRODUCTOS DE ALIMENTOS ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // Eliminar producto
        System.out.println("\n--- ELIMINAR PRODUCTO P02 ---");
        inventario.eliminarProducto("P02");
        inventario.listarProductos();

        // Actualizar stock
        System.out.println("\n--- ACTUALIZAR STOCK DE P01 ---");
        inventario.actualizarStock("P01", 80);

        // Total de stock
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        // Producto con mayor stock
        System.out.println("\n--- PRODUCTO CON MAYOR STOCK ---");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // Filtrar por precio
        System.out.println("\n--- PRODUCTOS ENTRE $1000 y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // Categorías disponibles
        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
