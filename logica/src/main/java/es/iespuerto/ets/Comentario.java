package es.iespuerto.ets;

/**
 * @author Roberto Martinez Pereira y Nuhazet Correa Torres
 */
public class Comentario {

    private String texto;

    /**
     * Metodo Constructor por defecto de la clase Comentario
     */
    public Comentario() {
    }
    /**
     * Constructor con parametros de la clase Comentario
     */
    public Comentario(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
        
    
}
