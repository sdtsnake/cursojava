
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        /*
            tipos primitivos flotante : float y double
         */
        // se tiene que castear porque 10 es entero
        float numeroFloat = (float) 10;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor minimo tipo float:" + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float:" + Float.MAX_VALUE);
        // no se castea por tener punto flotante.
        double numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("valor minimo tipo double:" + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double:" + Double.MAX_VALUE);

    }
}
