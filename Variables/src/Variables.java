
/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var condicion = false;
        if (condicion) {
            System.out.println("La condicon es verdadera");
        } else {
            System.out.println("La caondiocn es falsa");
        }

        var numero = 5;
       
        var numeroTexto="";
        
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numeor dos";
        } else if (numero == 3){
            numeroTexto = "Numero tres";
        } else if (numero == 4){
            numeroTexto = "Numero cuatro";
        }else {
            numeroTexto = "Numero no encotrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}

