package test;

/**
 *
 * @author snake
 */
public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        edades[0] = 36;
        edades[1] = 38;
        edades[2] = 40;

        
        for(int i=0;i<edades.length;i++){
            System.out.println("edades " + i + " = " + edades[i]);
        }
        
        String frutas[] = {"Naranja","Platano","Uva"};
        for (int i = 0; i<frutas.length; i++) {
            System.out.println("frutas "+ i + " = " + frutas[i]);
        }
        
        
        

    }
}
