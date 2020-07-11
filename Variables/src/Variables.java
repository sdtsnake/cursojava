
import java.util.Scanner;

/**
 *
 * @author snake
 */
public class Variables {

    public static void main(String[] args) {
        /*
            tipos primitivos enteros byte = 8 bits, short = 16 bits, int = 32 bits, long = 64 bits.
         */
        byte numeroByte = (byte) 129;
        System.out.println("Valorbyte:" + numeroByte);
        System.out.println("vakir minino de byte: " + Byte.MIN_VALUE);
        System.out.println("vakir minino de byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("vakir minino de Short: " + Short.MIN_VALUE);
        System.out.println("vakir minino de Short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minino de Short: " + Integer.MIN_VALUE);
        System.out.println("valor minino de Short: " + Integer.MAX_VALUE);

        long numeroLong = (long)9223372036854775808F;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minino de Long: " + Long.MIN_VALUE);
        System.out.println("valor minino de Long: " + Long.MAX_VALUE);

    }
}
