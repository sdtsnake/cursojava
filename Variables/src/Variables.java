
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        int a = 100, b = 2;
        {
            var resultado = a + b;
            System.out.println("La suma de a + b = " + resultado);

            resultado = a - b;
            System.out.println("La suma de a - b = " + resultado);

            resultado = a * b;
            System.out.println("La suma de a * b = " + resultado);
        }
        var resultado = (float) a / b;
        System.out.println("La suma de a / b = " + resultado);

        resultado = a % b;
        System.out.println("Residuo = " + resultado);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numnero impar");
        }

    }
}
