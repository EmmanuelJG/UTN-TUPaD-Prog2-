
package javaapp.TP5;
import java.util.Date;

public class ejercicio9 {

    public class CitaMedica{
        private Date fecha, hora;
        private Profesional profesional;
        private Paciente paciente;

        public CitaMedica(Date fecha, Date hora, Profesional profesional, Paciente paciente) {
            this.fecha = fecha;
            this.hora = hora;
            this.profesional = profesional;
            this.paciente = paciente;
        }
    }
    
    public class Profesional{
        private String nombre, especialidad;

        public Profesional(String nombre, String especialidad) {
            this.nombre = nombre;
            this.especialidad = especialidad;
        }
    }
    
    public class Paciente{
        private String nombre, obraSocial;

        public Paciente(String nombre, String obraSocial) {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }
    }
}
