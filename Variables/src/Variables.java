
/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        var usuario = "snake";
        var titulo = "Tecnologo Ingeniera de Sistemas";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);
        System.out.println(i + j + " " + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));

    }
}
