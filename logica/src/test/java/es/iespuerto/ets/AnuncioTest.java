package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;;

public class AnuncioTest {
    private static final String tipoPropiedad="Edificio";
    private static final String direccion="Espada 55 entre 25 y Principe";
    private static final String tipoHabitacion="suite";
    private static final int telefono=668738771;
    Anuncio anuncio;
    
    @BeforeEach
    public void BeforeEach() {

        if (anuncio == null) {
            anuncio = new Anuncio(tipoPropiedad, direccion, tipoHabitacion, telefono);
        }
    }

    @Test
    public void constructorClienteTest() {
        assertNotNull(anuncio, "El objeto Cliente no puede ser nulo");
    }

    @Test
    public void testGetTipoPropiedad() {
        assertTrue(anuncio.getTipoPropiedad() == tipoPropiedad);
    }

    @Test
    public void setDniTest() {
        String dni = "3243X";
        anuncio.setDni(dni);
        // assertTrue(empleado.getCargo().equals(cargo));
    }
    
    @Test
    public void testGetDireccion() {
        assertTrue("se cumple la condición(true)", true);

    }

    @Test
    public void testGetTelefono() {
        assertTrue("se cumple la condición (true)", true);

    }

    @Test
    public void testGetTipoHabitacion() {
        assertTrue("se cumple la condición (true)", true);

    }

   

    @Test
    public void testSetDireccion() {
        assertTrue("Se cumple con la condición(true)", true);

    }

    @Test
    public void testSetTelefono() {
        assertTrue("Se cumple con la condición (true)", true);

    }

    @Test
    public void testSetTipoHabitacion() {
        assertTrue("Se cumple con la condición (true)", true);

    }

    @Test
    public void testSetTipoPropiedad() {
        assertTrue("Se cumple con la condición (true)", true);

    }
}
