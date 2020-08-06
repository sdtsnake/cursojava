
package dominio;

/**
 *
 * @author snake
 */
public class Persona {
    protected String nombre;
    protected char genero;
    protected int eded;
    protected String direcicion;
    
    public Persona(){
        
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direcicion) {
        this.nombre = nombre;
        this.genero = genero;
        this.eded = edad;
        this.direcicion = direcicion;
    }

    public String getDirecicion() {
        return direcicion;
    }

    public void setDirecicion(String direcicion) {
        this.direcicion = direcicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEded() {
        return eded;
    }

    public void setEded(int eded) {
        this.eded = eded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", eded=").append(eded);
        sb.append(", direcicion=").append(direcicion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
