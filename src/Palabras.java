
import java.util.StringTokenizer;// libreria que nos ayudara a contar las palbras


public class Palabras {
    String frase;//guardo la palabra

        public int ContadorPalabras(String word) {
            frase = word;//La frase que queremos que cuente las
            StringTokenizer st = new StringTokenizer(frase);// crea el objeto para utilizar la funcion de contador con el parametro en String
            return st.countTokens();//Retorna el numero de palabras
        }
}
