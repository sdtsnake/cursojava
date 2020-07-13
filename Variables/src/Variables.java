
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var capturador = new Scanner(System.in);
        System.out.println("Proporciona al alto:");
        var alto = Double.parseDouble(capturador.nextLine());
        System.out.println("Proporciona el ancho:");
        var ancho = Double.parseDouble(capturador.nextLine());
        var area = alto * ancho;
        System.out.println("Area: " + area);
        var perimetro = (alto + ancho) * 2;
        System.out.println("Perimetro: " + perimetro);
    }
}
