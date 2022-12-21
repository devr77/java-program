import java.util.Scanner;

class MyDreamCar {

    String name;
    String model;

    public void accpet() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter you name:");

        this.name = in.nextLine();

        System.out.println("Enter you model:");

        this.model = in.nextLine();
    }


    public void display() {
        System.out.println("My dream car name is " + this.name);
        System.out.println("My dream car name is " + this.model);
    }
}


public class MyDreamCarTester {

    public static void main(String args[]) {

        MyDreamCar d = new MyDreamCar();
        d.accpet();
        d.display();

    }
}