
package javaapp.TP5;

public class ejercicio14 {

    public class Proyecto {
        private String nombre;
        private int duracionMin;

        public Proyecto(String nombre, int duracionMin) {
            this.nombre = nombre;
            this.duracionMin = duracionMin;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getDuracionMin() {
            return duracionMin;
        }

        public void setDuracionMin(int duracionMin) {
            this.duracionMin = duracionMin;
        }
    }
    
    public class Render {
        private String formato;
        private Proyecto proyecto;

        public Render(String formato, Proyecto proyecto) {
            this.formato = formato;
            this.proyecto = proyecto;
        }

        public String getFormato() {
            return formato;
        }

        public void setFormato(String formato) {
            this.formato = formato;
        }

        public Proyecto getProyecto() {
            return proyecto;
        }

        public void setProyecto(Proyecto proyecto) {
            this.proyecto = proyecto;
        }
    }
    
    private class EditorVideo{

        public void exportar(String formato, Proyecto proyecto){
            Render new_render = new Render(formato, proyecto);
            System.out.println("Proyecto renderizando: "+ new_render.getProyecto()
                    .getNombre() +"."+ new_render.getFormato());
        }
    }
}
