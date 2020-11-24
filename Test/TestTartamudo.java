import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTartamudo {

    Tartamudo tartamedeo;

    @Before
    public void Iniciar(){
        tartamedeo = new Tartamudo();
    }

    //Primera Prueba
    @Test
    public  void palabra1(){
        tartamedeo.extraccion("Canto");
        String resultado = tartamedeo.imprimir();
        String esperado = "Ca... Ca... nto?";
        assertEquals(esperado,resultado);
    }

    //Segunda Prueba
    @Test
    public  void palabra2(){
        tartamedeo.extraccion("Girasol");
        String resultado = tartamedeo.imprimir();
        String esperado = "Gi... Gi... rasol?";
        assertEquals(esperado,resultado);
    }
    //Tercera Prueba
    @Test
    public  void palabra3(){
        tartamedeo.extraccion("Soldado");
        String resultado = tartamedeo.imprimir();
        String esperado = "So... So... ldado?";
        assertEquals(esperado,resultado);
    }
}
