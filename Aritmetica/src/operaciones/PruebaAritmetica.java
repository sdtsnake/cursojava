package operaciones;

/**
 *
 * @author snake
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        {
            Aritmetica aritmetica1 = new Aritmetica();
            aritmetica1.a = 3;
            aritmetica1.b = 2;
            aritmetica1.sumar();
            int resultado = aritmetica1.sumarConRetorno();
            System.out.println("EL resultado de la prueba = " + resultado);

            resultado = aritmetica1.sumarConArgumentos(5, 8);
            System.out.println("Resultado con Argumentos = " + resultado);
        }
        {
            Aritmetica aritmetica1 = new Aritmetica();
            System.out.println("aritmetica1 a = " + aritmetica1.a);
            System.out.println("aritmetica1 b = " + aritmetica1.b);
            
            Aritmetica aritmetica2 = new Aritmetica(5, 8);
            System.out.println("aritmetica2 a = " + aritmetica2.a);
            System.out.println("aritmetica2 b = " + aritmetica2.b);
        }
    }

}
