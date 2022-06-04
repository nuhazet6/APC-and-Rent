package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class AnuncioTest {
    private static final String tipoPropiedad = "Edificio";
    private static final String direccion = "Espada 55 entre 25 y Principe";
    private static final String tipoHabitacion = "suite";
    private static final int telefono = 668738771;
    private static final int id=142;
    private static final String testSetString = "testSetter";
    private static final int testSetInt = 1234;
    Anuncio anuncio;

    @BeforeEach
    public void BeforeEach() {

        if (anuncio == null) {
            anuncio = new Anuncio(tipoPropiedad, direccion, tipoHabitacion, telefono,id);
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
        assertTrue(anuncio.getTelefono()== telefono, "El getter de telefono no funciona correctamente");
    }

    @Test
    void testGetTipoHabitacion() {
        assertTrue(anuncio.getTipoHabitacion()==tipoHabitacion, "El getter de tipoHabitacion no funciona correctamente");
    }

    @Test
    void testGetTipoPropiedad() {
        assertTrue(anuncio.getTipoPropiedad()==tipoPropiedad, "El getter de tipoPropiedad no funciona correctamente");
    }

    @Test
    void testGetId() {
        assertTrue(anuncio.getId()==id, "El getter de id no funciona correctamente");
    }

    @Test
    void testSetDireccion() {
        anuncio.setDireccion(testSetString);
        assertEquals(testSetString,anuncio.getDireccion(),"El setter de direccion no funciona correctamente");
    }

    @Test
    void testSetTelefono() {
        anuncio.setTelefono(testSetInt);
        assertEquals(testSetInt,anuncio.getTelefono(),"El setter de telefono no funciona correctamente");
    }

    @Test
    void testSetTipoHabitacion() {
        anuncio.setTipoHabitacion(testSetString);
        assertEquals(testSetString,anuncio.getTipoHabitacion(),"El setter de tipoHabitacion no funciona correctamente");
    }

    @Test
    void testSetTipoPropiedad() {        
        anuncio.setTipoPropiedad(testSetString);
        assertEquals(testSetString,anuncio.getTipoPropiedad(),"El setter de tipoPropiedad no funciona correctamente");
    }

    @Test
    void testSetId() {        
        anuncio.setId(testSetInt);
        assertEquals(testSetInt,anuncio.getId(),"El setter de id no funciona correctamente");
    }
    
}
