
package pasoporrefrencia;
import clases.Persona;

/**
 *
 * @author snake
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("Persona1 nombre: " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("Persona1 cmabio nombre: " + persona1.nombre);
        
        cambiaReferencia(persona1);
        System.out.println("Persona1 cmabio por referencia nombre: " + persona1.nombre); 
    }
     
    public static void cambiaReferencia (Persona persona){
        persona.nombre = "Karla"; 
    }
    
    public static Persona cambiaValor (Persona persona){
        persona.nombre = "Sebastian"; 
        return persona;
    }
    
    
}
