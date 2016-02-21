import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lab lab = new Lab();    // Java is just amazing
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Give me an integer\n> ");
        try {
            lab.GetLettersAndPrintStuff(keyboard.nextInt());
        } catch (Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }
}
