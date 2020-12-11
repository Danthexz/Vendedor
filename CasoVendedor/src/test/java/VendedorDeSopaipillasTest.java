import com.sun.deploy.security.SelectableSecurityManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorDeSopaipillasTest {
    private VendedorDeSopaipillas vendedorDeSopaipillas;
    @BeforeEach
    void setUp() {
        vendedorDeSopaipillas= new VendedorDeSopaipillas("Pedro");
    }

    @AfterEach
    void tearDown() {
        vendedorDeSopaipillas=null;
    }

    @Test
    void crearPrecio() {
    }

    @Test
    void crearInventario() {
        int resultadoObtenido=vendedorDeSopaipillas.crearInventario();
        boolean verdad;
        if(resultadoObtenido>= 1&& resultadoObtenido<11){
            verdad=true;
        }
        else{
            verdad=false;
        }
        assertTrue(verdad);


    }

    @Test
    void vender() {
        int resultadoEsperado=750;
        int resultadoObtenido=vendedorDeSopaipillas.vender(5);
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    @Test
    void actualizarInventario() {
    }

    @Test
    void reponer() {
    }

    @Test
    void darVuelto() {
    }
}