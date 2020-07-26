
import java.util.Scanner;


/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var estacion = "Estacion desconocida";  
        var capturador = new Scanner(System.in);
        System.out.println("Ingrese el mes para saber a que estacion pertenece:");
        int mes = Integer.parseInt(capturador.nextLine());

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";           
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }
        if (mes >=  1 && mes <= 12)
        {
            System.out.println("el mes " + mes + " corresponde a la estacion " + estacion);
        }else{
            System.out.println("Mes fuera del rango entre 1 & 12 revise animal");
        }
        
    }
}
