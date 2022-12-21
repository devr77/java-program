import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;

        try {
            System.out.println("Enter you number 1:");
            number1 = in.nextInt();
            System.out.println("Enter you number  2 :");
            number2 = in.nextInt();

        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        System.out.println("Sum:  " + (number1 + number2));
        System.out.println("Difference:  " + (number1 - number2));
        System.out.println("Product:  " + (number1 * number2));
        System.out.println("Quotient:  " + (number1 / number2));
        System.out.println("Reminder:  " + (number1 % number2));


    }

}
