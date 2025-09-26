/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.n3;

/**
 *
 * @author AMD-PC
 */
public class Estudiante {

    private String nombre, apellido, curso;
    private float calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion >= 0 ? calificacion : 0;
    }
    
    public void subirCalificacion(float puntos){
        this.calificacion += puntos;
    }
    
    public void bajarCalificacion(float puntos){
        this.calificacion -= puntos;
    }

    public String mostrarInfo(){
        return "Nombre:" + this.nombre +
                "\nApellido: "+ this.apellido +
                "\nCurso: "+ this.curso +
                "\nCalificación: "+ this.calificacion;
    }
    
}
