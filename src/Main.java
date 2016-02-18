import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Give me integer\n> ");
        try {
            number = keyboard.nextInt();
            int x = 0;
            while (number != 0) {
                x += number % 10;
                number /= 10;
            }
            System.out.println(String.format("X = %d", x));
            double squareRootOfX = Math.sqrt(x);
            System.out.println(String.format("Square root of x = %f", squareRootOfX));
            System.out.println(String.format("Rounded square root of x = %d", Math.round(squareRootOfX)));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }


    }
}
