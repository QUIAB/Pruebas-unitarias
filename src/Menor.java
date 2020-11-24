/*
* Cree un método que tome un número entero como único argumento y devuelva true si es menor o igual a cero; de lo contrario, devuelve false, ejemplos:
lessThanOrEqualToZero(5) ➞ false
lessThanOrEqualToZero(0) ➞ true
lessThanOrEqualToZero(-2) ➞ true
* */
public class Menor {

    public String numero(int a){
        if (a == 0){
            return "Verdadero";
        }else if(a<0){
            return "Verdadero";
        }else {
            return "False";
        }
    }
}
