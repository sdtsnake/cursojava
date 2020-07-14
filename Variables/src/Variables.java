
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = (a != b);
        System.out.println("d = " + d);
        
        var cadena1 = "Hola";
        var cadena2 = "Adios";
        var e = cadena1 == cadena2;
        System.out.println("e = " + e);
        
        var f = cadena1.equals(cadena2);
        System.out.println("e = " + e);   
        
        var g = a >= b;
        System.out.println("g = " + g);
        if(a % 2 == 0){
            System.out.println("Es numero par");
        }else{
            System.out.println("Es numero impar");
        }
        
         var edad = 30;
         var adulto = 18;
         
         if (edad > adulto){
             System.out.println("Es mayor de edad");
         }else{
             System.out.println("Es menor de edad");
         }
    }
}
