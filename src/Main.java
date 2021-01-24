import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inputAllBaseTypes();

        System.out.println("inputAllBaseTypes method complete");

    }

    /**
     * Takes input for all base types via Scanner System.in and prints them to screen via standard
     * out
     */

    public static void inputAllBaseTypes(){
        //boolean, char, byte, short, int, long, float, double

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a boolean value");
        boolean bool = input.nextBoolean();
        System.out.println(bool);

        System.out.println("Enter a char value");
        char ch = input.next().charAt(0);
        System.out.println(ch);

        System.out.println("Enter a byte value");
        byte by = input.nextByte();
        System.out.println(by);

        System.out.println("Enter a short value");
        short sh = input.nextShort();
        System.out.println(sh);

        System.out.println("Enter an integer value");
        int num = input.nextInt();
        System.out.println(num);

        System.out.println("Enter a long value");
        long lo = input.nextLong();
        System.out.println(lo);

        System.out.println("Enter a float value");
        float flo = input.nextFloat();
        System.out.println(flo);

        System.out.println("Enter a double value");
        double dub = input.nextDouble();
        System.out.println(dub);

    }

}
