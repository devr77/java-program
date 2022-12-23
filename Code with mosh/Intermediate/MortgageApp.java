import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageApp {

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1'000 and 1'000'000");
        }

        while (true) {
            System.out.println("Annual INterest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30)
                monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
                        break;
        }
        System.out.println("Enter a value between 1 and 30");


        while (true) {
            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30 ){
                numberOfPayments = years * MONTH_IN_YEAR;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format();
        System.out.println("Mortgage: " + mortgageFormatted);

    }

}
