package clases;

/**
 *
 * @author snake
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.nombre="Juan";
        persona1.apellido="Jaramillo";
        persona1.desplegarInfomacion();
        
        Persona persona2 = new Persona();
        
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInfomacion();
        
    }
}
