import resta.Resta;
import multiplicar.Multiplicar;
import suma.Suma;
public class Main {
    public static void main(String[] args) {
        Resta resta = new Resta();
        Multiplicar multi = new Multiplicar();
        Suma suma = new Suma();
        multi.operacion();
        suma.sumatoria();
        System.out.println(resta.resta());


    }
}