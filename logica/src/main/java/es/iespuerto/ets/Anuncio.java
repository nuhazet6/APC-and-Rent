package es.iespuerto.ets;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.*;

/**
 * 
 * @author Roberto Martinez y Nuhazet Correa Torres
 */
public class Anuncio {
    private List<Anuncio> anuncios = new ArrayList<>();
    private String tipoPropiedad;
    private String direccion;
    private String tipoHabitacion;
    private int telefono;
    private int id;




/**
 * Descripcion Constructor con todos los parametros 
 * @param tipoPropiedad parametro tipo de Propiedad del constructor con parametros  
 * @param direccion  parametro direccion del constructor con parametros 
 * @param tipoHabitacion parametro tipo de habitacion del constructor con parametros
 * @param telefono parametro telefono del metodo constructor con parametros de la clase 
 * @param id parametro id del metodo constructor con parametros de la clase
 */
    public Anuncio(String tipoPropiedad, String direccion, String tipoHabitacion, int telefono,int id) {
        this.tipoPropiedad = tipoPropiedad;
        this.direccion = direccion;
        this.tipoHabitacion = tipoHabitacion;
        this.telefono = telefono;
        this.id=id;
    }
   
    public String getTipoPropiedad() {
        return this.tipoPropiedad;
    }
    
    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
