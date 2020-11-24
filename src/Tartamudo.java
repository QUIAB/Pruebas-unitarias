public class Tartamudo {
    String tartamudeado;
    String repetir;
    String word;

    //Se extra las dos primeras letras de la palabra a repetir, sera llamado desde el main
    public void extraccion(String palabra){
        word = palabra;
        repetir= word.substring(0,2);//Las dos primeras letras de la palabra
    }

    //Se guarda en "tartamudeado" la parte que se le dificulta leer
    public void repeticion(){
        tartamudeado = repetir+"..."+" "+repetir+"..."+" ";
        repetir = null;//reinicio la variable para usarla despues.
    }

    //se extrae la parte que no se repite
    public void continuación(){
        //se utilizara "repetir" por que se reinicio en el anterior metodo
        repetir= word.substring(2,word.length());//despues del caracter 2 hasta el final.
    }

    public String imprimir(){
        repeticion();//LLamo al metodo para hacer la parte repetida
        continuación();//LLamo este metodo por el resto de la palabra

        //Junto la parte que se repite con el resto de la palabra.
        tartamudeado = tartamudeado+repetir;
        tartamudeado = tartamudeado +"?";

        // se retorna la palabra completa
        return tartamudeado;
    }

}
