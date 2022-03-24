package es.iespuerto.ets;

/**
 * @author Roberto Martinez Pereira y Nuhazet Correa Torres
 */

public class Cliente {

    private int codigoPostal;

    private String fechaRegistro;


    /**
     * Descripcion Constructor de la clase Cliente por defecto
     */
    public Cliente() {
    }
    /**
     * Descripcion Constructor con parametros de la clase Cliente 
     * @param codigoPostal primer parametro codigo postal del Constructor 
     * @param fechaRegistro segundo parametro fecha de registro del Constructor
     */
    public Cliente(int codigoPostal, String fechaRegistro) {
        this.codigoPostal = codigoPostal;
        this.fechaRegistro = fechaRegistro;
    }

    public int getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
        
    
}
