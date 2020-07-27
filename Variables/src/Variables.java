
import java.util.Scanner;


/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var numero = 5;
        String numeroTexto;
        
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto ="Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso desconocido";            
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
