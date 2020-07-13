
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var capturador = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        var nombre = String.valueOf(capturador.nextLine());
        System.out.println("Proporciona el id:");
        var numeroId = Integer.parseInt(capturador.nextLine());
        System.out.println("Proporciona el precio:");
        var precio = Double.parseDouble(capturador.nextLine());
        System.out.println("Envio Gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(capturador.nextLine());

        System.out.println(nombre + " #" + numeroId);
        System.out.println("Precio : $" + precio);
        System.out.println("Envio Gratuito :" + envioGratuito);

    }
}
