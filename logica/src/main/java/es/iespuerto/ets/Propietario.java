package es.iespuerto.ets;

/**
 * @author Nuhazet Correa Torres 
 */

public class Propietario {

    private int numPropiedades;

    /**
     * Constructor de la clase por defecto de la clase Propietario */ 
    public Propietario() {
    }

    /**
     * Descripcion Metodo constructor con parametros de la clase Propietario 
     * @param numPropiedades primer parametro del metodo constructor con parametros
     */
    public Propietario(int numPropiedades) {
        this.numPropiedades = numPropiedades;
    }

    public int getNumPropiedades() {
        return this.numPropiedades;
    }

    public void setNumPropiedades(int numPropiedades) {
        this.numPropiedades = numPropiedades;
    }

    
}
