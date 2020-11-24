import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PalabrasTest {
    Palabras cPalabras;

    @Before
    public void inicador (){
      cPalabras = new Palabras();
    }

    @Test
    public void frase1(){
        int resultado = cPalabras.ContadorPalabras("El ejemplo hace movernos hacia adelante");
        int esperado = 6;
        assertEquals(esperado,resultado);
    }

    @Test
    public void frase2(){
        int resultado = cPalabras.ContadorPalabras("Esto es fácil de aprender");
        int esperado = 5;
        assertEquals(esperado,resultado);
    }

    @Test
    public void frase3(){
        int resultado = cPalabras.ContadorPalabras("Esto es un test");
        int esperado = 4;
        assertEquals(esperado,resultado);
    }
}
