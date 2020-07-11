
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        boolean varBoolean = true;        
        if(varBoolean){
            System.out.println("la bandera es verdadera");
        }
        else{
            System.out.println("la bandera es falsa");
        }
        
        var edad = 10;
        var esAdulto = edad >= 18;
        
        if(esAdulto){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
    }
}
