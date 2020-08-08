
package dominio;

/**
 *
 * @author snake
 */
public class Persona {
    public static final int MY_CONSTANTE = 5;
    private String nombre;
    
    public final void imprimir(){
        System.out.println("Metodo Imprimir");   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
