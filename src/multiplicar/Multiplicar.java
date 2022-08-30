package multiplicar;

import java.util.Scanner;

public class Multiplicar {
    public int operacion() {

        int numero_1;
        int numero_2;
        int resultado;

        Scanner constructor = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        numero_1 = constructor.nextInt();

        System.out.println("Ingrese el segundo numero:");
        numero_2 = constructor.nextInt();

        resultado = numero_1 * numero_2;

        System.out.println(resultado);
        return resultado;
    }
}
