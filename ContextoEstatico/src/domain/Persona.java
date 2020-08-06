package domain;

/**
 *
 * @author snake
 */
public class Persona {

    private int idPersona;
    private String nombre;
    private static int contatorPesona;

    public Persona(String nombre) {
        this.nombre = nombre;
        Persona.contatorPesona ++;
        this.idPersona = Persona.contatorPesona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContatorPesona() {
        return contatorPesona;
    }

    public static void setContatorPesona(int aContatorPesona) {
        contatorPesona = aContatorPesona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}
