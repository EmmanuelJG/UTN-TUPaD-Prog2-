/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n6.EJERC03;

/**
 *
 * @author AMD-PC
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Sincroniza ambos lados al asignar/cambiar profesor
    public void setProfesor(Profesor p) {
        if (this.profesor == p) return; // Evita ciclos infinitos

        Profesor anterior = this.profesor;
        this.profesor = p;

        // Si tenía profesor previo, quitar este curso de su lista
        if (anterior != null) {
            anterior.getCursos().remove(this);
        }

        // Si se asigna nuevo profesor, agregar este curso a su lista
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor asignado";
        System.out.println("Curso: " + nombre + " | Código: " + codigo + " | Profesor: " + nombreProfesor);
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }
}
