package test;

import dominio.Persona;

/**
 *
 * @author snake
 */
public class TestFianl {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
        System.out.println("MI_CONSTANTE = " + Persona.MY_CONSTANTE);
        
        final Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
}
