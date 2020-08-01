package caja;

/**
 *
 * @author snake
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja (){
        this.alto = 0;
        this.alto = 0;
        this.profundo = 0;   
    }
    
    public Caja (int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVol(){
        return this.ancho * this.ancho * this.profundo;
    }  
}
