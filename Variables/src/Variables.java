
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var capturador = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(capturador.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(capturador.nextLine());
        int resultado = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es: " + resultado);
    }
}
