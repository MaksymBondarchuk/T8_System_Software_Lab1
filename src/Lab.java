

public class Lab {
    public int getLettersAndPrintStuff(int number) {
        if (!hasOnly3Digits(number))
            return -1;

        int x = 0;
        while (number != 0) {
            x += number % 10;
            number /= 10;
        }
        double squareRootOfX = Math.sqrt(x);
        System.out.println(String.format("Square root of x = %f", squareRootOfX));
        System.out.println(String.format("Rounded square root of x = %d", Math.round(squareRootOfX)));
        return x;
    }

    public boolean hasOnly3Digits(int number) {
        return 100 <= number && number <= 999;
    }
}
