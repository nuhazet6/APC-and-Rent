package es.iespuerto.ets;

/**
 * @author Nuhazet Correa Torres 
 */
public class Propietario extends Cuenta {

    private int numPropiedades;

    /**
     * Constructor de la clase por defecto de la clase Propietario */ 
    public Propietario() {
    }

   /**
    * Constructor de Propietario que recibe 9 parametros
    * @param nick nick del propietario
    * @param contrasena contrasena del propietario
    * @param rol rol del propietario
    * @param nombreCompleto nombreCompleto del propietario
    * @param dni dni del propietario
    * @param telefono telefono del propietario
    * @param codigoPostal codigoPostal del propietario
    * @param fechaRegistro fechaRegistro del propietario
    * @param numPropiedades numPropiedades del propietario
    */
    public Propietario(String nick,String contrasena,String rol,String nombreCompleto,String dni,int telefono,
    int codigoPostal,String fechaRegistro,int numPropiedades) {

        super(nick, contrasena, rol, nombreCompleto, dni, telefono, codigoPostal, fechaRegistro);
        this.numPropiedades = numPropiedades;
    }

    public int getNumPropiedades() {
        return this.numPropiedades;
    }

    public void setNumPropiedades(int numPropiedades) {
        this.numPropiedades = numPropiedades;
    }
    public String getNick() {
        return super.getNick();
    }

    public void setNick(String nick) {
        super.setNick(nick);
    }

    public String getContrasena() {
        return super.getContrasena();
    }

    public void setContrasena(String contrasena) {
        super.setContrasena(contrasena);
    }

    public String getRol() {
        return super.getRol();
    }

    public void setRol(String rol) {
        super.setRol(rol);
    }

    public String getNombreCompleto() {
        return super.getNombreCompleto();
    }

    public void setNombreCompleto(String nombreCompleto) {
        super.setNombreCompleto(nombreCompleto);
    }

    public String getDni() {
        return super.getDni();
    }

    public void setDni(String dni) {
        super.setDni(dni);
    }

    public int getTelefono() {
        return super.getTelefono();
    }

    public void setTelefono(int telefono) {
        super.setTelefono(telefono);
    }
     public int getCodigoPostal() {
        return super.getCodigoPostal();
    }

    public void setCodigoPostal(int codigoPostal) {
        super.setCodigoPostal(codigoPostal);
    }

    public String getFechaRegistro() {
        return super.getFechaRegistro();
    }

    public void setFechaRegistro(String fechaRegistro) {
        super.setFechaRegistro(fechaRegistro);
    }
    
    
}
