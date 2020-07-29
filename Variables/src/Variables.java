
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        {
            for (int contador = 1; contador <= 10; contador++) {
                if (contador % 2 == 0) {
                    System.out.println("contador = " + contador);
                    break;
                }
            }
        }
        {
            for (int contador = 10; contador <= 20; contador++) {
                if (contador % 2 != 0) {                    
                    continue;
                }
                System.out.println("contador = " + contador);
            }
        }
    }
}
