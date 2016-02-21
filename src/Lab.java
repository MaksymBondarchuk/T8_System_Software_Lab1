import java.util.Scanner;

/**
 * Created by Max on 2016-02-21.
 *
 */
public class Lab {
    public int GetLettersAndPrintStuff() {
        int number = -1;
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
        return number;
    }

}
