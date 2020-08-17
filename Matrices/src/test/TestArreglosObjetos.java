
package test;

import dominio.Persona;

/**
 *
 * @author snake
 */
public class TestArreglosObjetos {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");

        
        for(int i=0; i<personas.length;i++){
            System.out.println("personas " + i + " = " + personas[i]);
        }
    }
}
