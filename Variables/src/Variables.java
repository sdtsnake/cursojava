
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        {
            System.out.println("Incrementos");
            System.out.println("===========");
            
            var e = 3;
            var f = ++e; //pre incremento
            System.out.println("e = " + e);
            System.out.println("f = " + f);

            var g = 5;
            var h = g++; //post incremento
            System.out.println("g = " + g);
            System.out.println("h = " + h);
        }
        {
            System.out.println("dectementos");
            System.out.println("===========");
            
            var e = 2;
            var f = --e; //pre decremento
            System.out.println("e = " + e);
            System.out.println("f = " + f);

            var g = 4;
            var h = g--; //post decremento
            System.out.println("g = " + g);
            System.out.println("h = " + h);
        }

    }
}
