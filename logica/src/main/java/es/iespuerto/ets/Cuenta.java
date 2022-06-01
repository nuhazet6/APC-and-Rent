package es.iespuerto.ets;

/**
 * @author Nuhazet Correa Torres y Roberto Martinez 
 */

public abstract class Cuenta {

    private String nick;
    private String contrasena;
    private String rol;
    private String nombreCompleto;
    private String dni;
    private int telefono;
    private int codigoPostal;
    private String fechaRegistro;

    /**
     * Descripcion Metodo constructor de la clase Cuenta
     */
    public Cuenta() {
    }
    
    /**
     * Descripcion metodo constructor con parametros de la clase Cuenta
     * @param nick primer parametro del constructor con parametros nickname
     * @param contrasena segundo parametro del constructor con parametros contrasena
     * @param rol tercero tercer parametro del constructor con parametros rol
     * @param nombreCompleto cuarto parametro del constructor con parametros nombre completo
     * @param dni quinto parametro del constructor con parametros dni
     * @param telefono sexto parametro del constructor con parametros telefono 
     */
    public Cuenta(String nick, String contrasena, String rol, String nombreCompleto, String dni, int telefono, int codigoPostal, String fechaRegistro) {
        this.nick = nick;
        this.contrasena = contrasena;
        this.rol = rol;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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

