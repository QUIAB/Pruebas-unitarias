public class Promo {

    int gratis;
    int total;

    //el metodo obtiene los te`s gratis con los comprados
    public int promocion(int te){

        gratis = te/6;// se guarda el numero de te´s gratis
        total = te + gratis;//suma los te´s comprados con los gratis
        return total;//retorna el numero de te´s con la promoción
    }
}
