/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.n6.EJERC03;

/**
 *
 * @author AMD-PC
 */
public class Main {
    public static void main(String[] args) {
        Universidad univ = new Universidad("Universidad Nacional");

        // 1️⃣ Crear profesores
        Profesor prof1 = new Profesor("P01", "María González", "Matemática");
        Profesor prof2 = new Profesor("P02", "Carlos Pérez", "Informática");
        Profesor prof3 = new Profesor("P03", "Laura Fernández", "Física");

        // 2️⃣ Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Programación I");
        Curso c3 = new Curso("C103", "Mecánica");
        Curso c4 = new Curso("C104", "Programación II");
        Curso c5 = new Curso("C105", "Cálculo");

        // Agregar profesores y cursos a la universidad
        univ.agregarProfesor(prof1);
        univ.agregarProfesor(prof2);
        univ.agregarProfesor(prof3);

        univ.agregarCurso(c1);
        univ.agregarCurso(c2);
        univ.agregarCurso(c3);
        univ.agregarCurso(c4);
        univ.agregarCurso(c5);

        // 3️⃣ Asignar profesores a cursos
        univ.asignarProfesorACurso("C101", "P01");
        univ.asignarProfesorACurso("C105", "P01");
        univ.asignarProfesorACurso("C102", "P02");
        univ.asignarProfesorACurso("C104", "P02");
        univ.asignarProfesorACurso("C103", "P03");

        // 4️⃣ Listar cursos y profesores
        univ.listarCursos();
        univ.listarProfesores();

        // 5️⃣ Cambiar profesor de un curso
        System.out.println("\n Cambiando profesor del curso 'C104'...");
        c4.setProfesor(prof3);

        univ.listarCursos();
        univ.listarProfesores();

        // 6️⃣ Eliminar curso y verificar sincronización
        System.out.println("\n️ Eliminando curso 'C102'...");
        univ.eliminarCurso("C102");
        univ.listarCursos();
        univ.listarProfesores();

        // 7️⃣ Eliminar profesor y dejar cursos sin profesor
        System.out.println("\n Eliminando profesor 'P01'...");
        univ.eliminarProfesor("P01");
        univ.listarCursos();
        univ.listarProfesores();

        // 8️⃣ Reporte final
        univ.reporteCursosPorProfesor();
    }
}

