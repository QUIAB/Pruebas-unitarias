import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PromoTest {
    Promo promociones;//Se avisa que se creara un objeto

    //se crea primero el objeto
    @Before
    public void iniciador(){
        promociones = new Promo();
    }

    //primera prueba
    @Test
    public void promo1(){
        int resultado = promociones.promocion(10);
        int esperado = 11;
        assertEquals(esperado,resultado);
    }
    //Segunda prueba
    @Test
    public void promo2(){
        int resultado = promociones.promocion(100);
        int esperado = 116;
        assertEquals(esperado,resultado);
    }

    //Tercera prueba
    @Test
    public void promo3(){
        int resultado = promociones.promocion(6);
        int esperado = 7;
        assertEquals(esperado,resultado);
    }
}
