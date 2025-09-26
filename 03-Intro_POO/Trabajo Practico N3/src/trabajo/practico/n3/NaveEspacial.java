/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n3;

/**
 *
 * @author AMD-PC
 */
public class NaveEspacial {
    private String nombre; 
    private int combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void despegar(){
        if (this.combustible >= 50){
            System.out.println("¡DESPEGANDO!");
        } else {
            System.out.println("No es posible despegar...");
        }
    }
    
    public void avanzar(int distancia){
        if(this.combustible > 0){
            System.out.println("AVANZANDO La nave va hacia la pista de lanzamiento");
        } else {
            System.out.println("Antes de avanzar necesitas recargar combustible!");
        }
    }
    
    public void recargarCombustible(int cantidad){
        setCombustible(cantidad);
        System.out.println("Recargando combustible: "+ cantidad + " litros");
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre: "+ this.nombre + "\nCombustible: "+ 
                this.combustible+ " litros");
    }
}
