package caja;

/**
 *
 * @author snake
 */
public class CalculoVolumen {

    public static void main(String[] args) {
        Caja ObjCaja1 = new Caja();
        ObjCaja1.alto = 2;
        ObjCaja1.ancho = 3;
        ObjCaja1.profundo = 6;
        System.out.println("El volumen de la caja es : " + ObjCaja1.calcularVol());
        
        Caja ObjCaja2 = new Caja(6,2,3);
        System.out.println("El volumen de la caja es : " + ObjCaja1.calcularVol());
        
        

    }
}
