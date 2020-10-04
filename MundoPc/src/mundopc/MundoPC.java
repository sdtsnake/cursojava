
package mundopc;

import com.snakecorp.*;

/**
 *
 * @author snake
 */
public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora Hp",monitorHP,tecladoHP,ratonHP);

        Monitor monitorRog = new Monitor("ROG",32);
        Teclado tecladoRog = new Teclado("Bluetooth","ROG");
        Raton ratonRog = new Raton("Bluetooth","ROG");
        Computadora computadoraRog = new Computadora("Computadora ROG",monitorRog,tecladoRog,ratonRog);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraRog);
        
        orden1.mostrarOrden();
                   
                        


    }
    
    
}
