
//importo las librerias necesarias para realizas las pruebas
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testmenor {
    //primero se crea el objeto ara poder utilizar su metodo
    Menor prueba;

    @Before
    public void  antes(){
        prueba = new Menor();
    }

    //primera prueba unitaria
    @Test
    public void menorTest(){
        String resultado = prueba.numero(7);
        String esperado= "False";
        assertEquals(esperado,resultado);
    }

    //Segunda prueba unitaria
    @Test
    public void menorTest2(){
        String resultado = prueba.numero(0);
        String esperado= "Verdadero";
        assertEquals(esperado,resultado);
    }

    //Tercera prueba unitaria
    @Test
    public void menorTest3() {
        String resultado = prueba.numero(-2);
        String esperado= "Verdadero";
        assertEquals(esperado,resultado);
    }
}

