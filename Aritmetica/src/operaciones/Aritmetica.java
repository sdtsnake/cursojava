package operaciones;

/**
 *
 * @author snake
 */
public class Aritmetica {

    //atributos
    int a;
    int b;

    //constructores
    public Aritmetica() {
        System.out.println("Ejecuntando contructor");
    }
    
    public Aritmetica (int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando el contrutor con argumentos");
    }

    //metodos
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        // return a + b+;     
        int resultado = this.a + this.b;
        return resultado;

    }

    public int sumarConArgumentos(int argu1, int argu2) {
        this.a = argu1;
        this.b = argu2;
//        return a + b;
        return this.sumarConRetorno();
    }
}
