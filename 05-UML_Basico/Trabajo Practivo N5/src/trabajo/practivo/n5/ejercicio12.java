
package javaapp.TP5;

public class ejercicio12 {

    public class Contribuyente{
        private String nombre, cuil;

        public Contribuyente(String nombre, String cuil) {
            this.nombre = nombre;
            this.cuil = cuil;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCuil() {
            return cuil;
        }

        public void setCuil(String cuil) {
            this.cuil = cuil;
        }
    }
    
    public class Impuesto{
        private double monto;
        private Contribuyente contribuyente;

        public Impuesto(double monto, Contribuyente contribuyente) {
            this.monto = monto;
            this.contribuyente = contribuyente;
        }

        public double getMonto() {
            return monto;
        }

        public void setMonto(double monto) {
            this.monto = monto;
        }

        public Contribuyente getContribuyente() {
            return contribuyente;
        }

        public void setContribuyente(Contribuyente contribuyente) {
            this.contribuyente = contribuyente;
        }
    }
    
    public class Calculadora{
        
        public void calcular(Impuesto imp){
            imp.setMonto(imp.getMonto() * 0.2);
            //Setteo el nuevo monto con un 20% de aumento
        }
    }
}
