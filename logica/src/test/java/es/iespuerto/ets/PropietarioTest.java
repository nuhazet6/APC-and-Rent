package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class PropietarioTest {
    private static final String nick = "farasd";
    private static final String contrasena = "wodfoa13";
    private static final String rol="Cliente";
    private static final String nombreCompleto = "Aday Fernandez Gonzalez";
    private static final String dni ="13231123F";
    private static final int telefono = 61241232;
    private static final int codigoPostal = 38400;
    private static final String fechaRegistro = "07/02/2022";
    private static final int numPropiedades = 6;
    private static final String testSetString = "testSetter";
    private static final int testSetInt = 1234;
    Propietario propietario;
 

    @BeforeEach
    public void BeforeEach() {

        if (propietario == null) {
            propietario = new Propietario(nick, contrasena, rol, nombreCompleto,dni,telefono,codigoPostal,fechaRegistro,numPropiedades);
        }
    }

    @Test
    public void constructorPropietarioTest() {
        assertNotNull(propietario, "El objeto propietario no puede ser nulo");
    }

    @Test
    public void testGetContrasena() {
        assertTrue(propietario.getContrasena()==contrasena, "El getter de dirección no funciona correctamente");
    }

    @Test
    void testGetNombreCompleto() {
        assertTrue(propietario.getNombreCompleto()== nombreCompleto, "El getter de nombreCompleto no funciona correctamente");
    }

    @Test
    void testGetRol() {
        assertTrue(propietario.getRol()==rol, "El getter de rol no funciona correctamente");
    }

    @Test
    void testGetNick() {
        assertTrue(propietario.getNick()==nick, "El getter de nick no funciona correctamente");
    }

    @Test
    void testGetDni() {
        assertTrue(propietario.getDni()==dni, "El getter de dni no funciona correctamente");
    }

    @Test
    void testSetContrasena() {
        propietario.setContrasena(testSetString);
        assertEquals(testSetString,propietario.getContrasena(),"El setter de contrasena no funciona correctamente");
    }

    @Test
    void testSetNombreCompleto() {
        propietario.setNombreCompleto(testSetString);
        assertEquals(testSetString,propietario.getNombreCompleto(),"El setter de nombreCompleto no funciona correctamente");
    }

    @Test
    void testSetRol() {
        propietario.setRol(testSetString);
        assertEquals(testSetString,propietario.getRol(),"El setter de rol no funciona correctamente");
    }

    @Test
    void testSetNick() {        
        propietario.setNick(testSetString);
        assertEquals(testSetString,propietario.getNick(),"El setter de nick no funciona correctamente");
    }

    @Test
    void testSetDni() {        
        propietario.setDni(testSetString);
        assertEquals(testSetString,propietario.getDni(),"El setter de dni no funciona correctamente");
    }

    @Test
    void testSetTelefono() {        
        propietario.setTelefono(testSetInt);
        assertEquals(testSetInt,propietario.getTelefono(),"El setter de telefono no funciona correctamente");
    }

    @Test
    void testSetCodigoPostal() {        
        propietario.setCodigoPostal(testSetInt);
        assertEquals(testSetInt,propietario.getCodigoPostal(),"El setter de codigoPostal no funciona correctamente");
    }

    @Test
    void testSetFechaRegistro() {        
        propietario.setFechaRegistro(testSetString);
        assertEquals(testSetString,propietario.getFechaRegistro(),"El setter de fechaRegistro no funciona correctamente");
    }

    @Test
    void testSetNumPropiedades() {        
        propietario.setNumPropiedades(testSetInt);
        assertEquals(testSetInt,propietario.getNumPropiedades(),"El setter de numPropiedades no funciona correctamente");
    }
}
