package test;
import dominio.*;

/**
 *
 * @author snake
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan",5000.00,false);
        // se puede mandar a llamar sin hacer referencia al metodo to string porque el metodo String al tener un println el sabe que debe hacer
        System.out.println("persona1 : " + persona1);  
        persona1.setNombre("Juan carlos");
        //pero tambien se puede especificar no hay problema en hacerlo.
        System.out.println("persona1 : " + persona1.toString());  

    }
}
