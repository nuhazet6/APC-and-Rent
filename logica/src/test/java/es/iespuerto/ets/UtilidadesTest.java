package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.*;
public class UtilidadesTest {

    @Test
    public void obtenerPathFicheroTest() throws FileNotFoundException, URISyntaxException{
        Assertions.assertNotEquals("",Utilidades.obtenerPathFichero("pruebaTest.txt"),"Error en la ruta");
    }

    @Test
    void testObtenerPathFichero() {
        
    }
}
