package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class AnuncioTest {
    private static final String tipoPropiedad = "Edificio";
    private static final String direccion = "Espada 55 entre 25 y Principe";
    private static final String tipoHabitacion = "suite";
    private static final int telefono = 668738771;
    Anuncio anuncio;

    @BeforeEach
    public void BeforeEach() {

        if (anuncio == null) {
            anuncio = new Anuncio(tipoPropiedad, direccion, tipoHabitacion, telefono);
        }
    }

    @Test
    public void constructorAnuncioTest() {
        assertNotNull(anuncio, "El objeto anuncio no puede ser nulo");
    }

    @Test
    public void testGetDireccion() {
        assertTrue(anuncio.getDireccion()==direccion, "El getter de dirección no funciona correctamente");
    }

    @Test
    void testGetTelefono() {
        assertTrue(anuncio.getDireccion()==direccion, "El getter de dirección no funciona correctamente");
    }

    @Test
    void testGetTipoHabitacion() {
        assertTrue(anuncio.getDireccion()==direccion, "El getter de dirección no funciona correctamente");
    }

    @Test
    void testGetTipoPropiedad() {
        assertTrue(anuncio.getTipoPropiedad()==tipoPropiedad, "El getter de tipoPropiedad no funciona correctamente");
    }

    @Test
    void testSetDireccion() {
        
    }

    @Test
    void testSetTelefono() {
        
    }

    @Test
    void testSetTipoHabitacion() {
        
    }

    @Test
    void testSetTipoPropiedad() {
        
    }
    
}
