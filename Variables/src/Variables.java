
import java.util.Scanner;


/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        System.out.println("Proporciona el Titulo : ");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor : ");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
