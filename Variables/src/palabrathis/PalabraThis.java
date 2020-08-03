package palabrathis;

/**
 *
 * @author snake
 */
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Lopez");
        System.out.println("perosna = " + persona);
        
        System.out.println("persona nombre : " + persona.nombre);
        System.out.println("persona apellidos : " + persona.apellido);
        
        

    }
}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        super();
        System.out.println("Objeto perosna usando this = " + this);
        this.nombre = nombre;
        this.apellido = apellido;
        
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona perosna){
        System.out.println("perosna desde imprimir = " + perosna);
        System.out.println("impresion del objeto actual(his) = " + this);
    }
}
