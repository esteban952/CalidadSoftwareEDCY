
package examenpractico;

import org.junit.Test;
import static org.junit.Assert.*;

public class ObtenerAccionTest {
    
    public ObtenerAccionTest() {
    }

    @Test
    public void testSomeMethod() {
        System.out.println("Obtener Accion");
        ObtenerAccion instance = new ObtenerAccion("si", true, true, "docente", "porConfirmar");
        String expResult = "actualizar";
        String result = instance.obtenerAccion();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSomeMethod2() {
        System.out.println("Obtener Accion");
        ObtenerAccion instance = new ObtenerAccion("no", true, true, "docente", "vigente");
        String expResult = "matricular";
        String result = instance.obtenerAccion();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSomeMethod3() {
        System.out.println("Obtener Accion");
        ObtenerAccion instance = new ObtenerAccion("si", true, true, "docente", "porConfirmar");
        String expResult = "actualizar";
        String result = instance.obtenerAccion();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSomeMetho4() {
        System.out.println("Obtener Accion");
        ObtenerAccion instance = new ObtenerAccion("no", false, true, "externo", "");
        String expResult = "registrar";
        String result = instance.obtenerAccion();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
