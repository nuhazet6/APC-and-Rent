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
    private List<Anuncio> anuncio = new ArrayList<>();
    private String tipoPropiedad;
    private String direccion;
    private String tipoHabitacion;
    private int telefono;


/**
 * Descripcion Constructor con todos los parametros 
 * @param tipoPropiedad parametro tipo de Propiedad del constructor con parametros  
 * @param direccion  parametro direccion del constructor con parametros 
 * @param tipoHabitacion parametro tipo de habitacion del constructor con parametros
 * @param telefono parametro telefono del metodo constructor con parametros de la clase 
 */
    public Anuncio(String tipoPropiedad, String direccion, String tipoHabitacion, int telefono) {
        this.tipoPropiedad = tipoPropiedad;
        this.direccion = direccion;
        this.tipoHabitacion = tipoHabitacion;
        this.telefono = telefono;
    }

    public List<Anuncio> leerAnuncios() throws FileNotFoundException, URISyntaxException {
        List<Anuncio> anuncio = new ArrayList<>();
        Scanner fichero = new Scanner(new File(Utilidades.obtenerPathFichero("anuncio.txt")));
        String linea;
        String[] lineaDatos;
        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(";");
            anuncio.add(new Anuncio(lineaDatos[0], lineaDatos[1], lineaDatos[2],
            Integer.parseInt(lineaDatos[3])));
        }
        return anuncio;
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

    
}
