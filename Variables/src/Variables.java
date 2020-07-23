
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
      var a = 11;
      var valorMinimo =0;
      var valorMaximo = 10;
      
      var resultado = a >= valorMinimo && a <= valorMaximo;
      if (resultado){
          System.out.println("Dentro de Rango");   
      }else{
          System.out.println("Fuera de Rango");
      }
      
      var vaciones = false;
      var diaDescanso = true;
      
      if (vaciones || diaDescanso){
          System.out.println("El padre puede asistir al juego de su hijo");
      }else{
          System.out.println("El padre esta ocuapado");
      }
    }
}
