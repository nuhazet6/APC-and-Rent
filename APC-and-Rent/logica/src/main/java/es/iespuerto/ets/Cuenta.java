package es.iespuerto.ets;

public class Cuenta {

    private String nick;
    private String contrasena;
    private String rol;
    private String nombreCompleto;
    private String dni;
    private int telefono;


    public Cuenta() {
    }
    

    public Cuenta(String nick, String contrasena, String rol, String nombreCompleto, String dni, int telefono) {
        this.nick = nick;
        this.contrasena = contrasena;
        this.rol = rol;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.telefono = telefono;
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



    
}

