/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n3;

/**
 *
 * @author AMD-PC
 */
public class Gallina {
    private int idGallina, edad, huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo(){
        this.huevosPuestos += 1;
    }
    
    public void envejecer(){
        this.edad += 1;
    }
    
    public void mostrarEstado(){
        System.out.println("Datos de gallina\nID: "+ this.idGallina +
                "\nEdad: "+ this.edad + "\nHuevos Puestos: "+ this.huevosPuestos);
    }
}
