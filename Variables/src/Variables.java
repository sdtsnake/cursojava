
import java.util.Scanner;


/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre : ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe Titulo : ");
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);
    }
}
