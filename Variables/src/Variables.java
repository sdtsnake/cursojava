
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        {
            char varChar = '\u0021';
            System.out.println("varChar = " + varChar);

            char varCharDecimal = 33;
            System.out.println("varCharDecimal = " + varCharDecimal);

            char varCharSimbolo = '!';
            System.out.println("varCharSimbolo = " + varCharSimbolo);
        }
        {
            var varChar = '\u0021';
            System.out.println("varChar2 = " + varChar);
            // se castea porque el valor 33 el tipo var infiere que un entero
            var varCharDecimal = (char)33;
            System.out.println("varCharDecimal2 = " + varCharDecimal);

            var varCharSimbolo = '!';
            System.out.println("varCharSimbolo2 = " + varCharSimbolo);
        }
        // aquie restorna el valor decimal de los casractes.
        int variableEnteraSimbolo = 'A';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

    }
}
