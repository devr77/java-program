import java.util.Scanner;

class SimpleMyDreamCar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = "";
        String model = "";

        try {
            System.out.println("Enter you name:");
            name = in.nextLine();
            System.out.println("Enter you model:");
            model = in.nextLine();

        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        System.out.println("My dream car name is " + name);
        System.out.println("My dream car nam e is " + model);

    }
}