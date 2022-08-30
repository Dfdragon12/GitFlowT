package suma;

import java.util.Scanner;

public class Suma {
    public void sumatoria (){
       int a,b;

        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese digito 1");
        a = scan.nextInt();

        System.out.println("ingrese digito 2");
        b = scan.nextInt();

        System.out.println(a+b);
    }
}
