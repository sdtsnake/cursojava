
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var contador = 0;
        while(contador < 3){
            System.out.println("contador = " + contador);
            contador ++;
        }
        contador = 0;
        do {
            System.out.println("contador = " + contador); 
            contador ++;
        }while(contador < 3);
        
    }
}
