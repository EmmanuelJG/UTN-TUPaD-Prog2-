
package javaapp.TP5;

public class ejercicio5 {

    public class Computadora{
        private String marca;
        private int numSerie;
        private Propietario propietario;
        private PlacaMadre placaMadre;

        public Computadora(String marca, int numSerie, Propietario propietario, PlacaMadre placaMadre) {
            this.marca = marca;
            this.numSerie = numSerie;
            this.propietario = propietario;
            this.placaMadre = placaMadre;
        }
    }
    
    public class Propietario{
        private String nombre;
        private int dni;
        private Computadora computadora;

        public Propietario(String nombre, int dni, Computadora computadora) {
            this.nombre = nombre;
            this.dni = dni;
            this.computadora = computadora;
        }        
    }
    
    public class PlacaMadre{
        private String modelo, chipset;

        public PlacaMadre(String modelo, String chipset) {
            this.modelo = modelo;
            this.chipset = chipset;
        }    
    }
}
