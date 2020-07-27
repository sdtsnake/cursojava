
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var calificaion = "Valor desconocido debe estar entre 0 y 10";
        var capturador = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        double nota = Double.parseDouble(capturador.nextLine());

        if (nota >= 9 && nota <= 10) {
            calificaion = "A";
        } else if (nota >= 8 && nota < 9) {
            calificaion = "B";
        } else if (nota >= 7 && nota < 8) {
            calificaion = "C";
        } else if (nota >= 6 && nota < 7) {
            calificaion = "D";
        } else if (nota >= 0 && nota < 6) {
            calificaion = "F";
        } 
        System.out.println("calificaion = " + calificaion);
    }
}
