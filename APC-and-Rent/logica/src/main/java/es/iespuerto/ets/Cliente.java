package es.iespuerto.ets;

public class Cliente {

    private int codigoPostal;

    private String fechaRegistro;



    public Cliente() {
    }

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
