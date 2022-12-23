import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte age = 30;
//        age.for will give you the following code
//        for (byte i = 0; i < age; i++) {}
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = new String("Hello World!"); // made redundant
        String message1 = "  Hello Romina...  ";

        System.out.println(message);
        System.out.println(message1);
        System.out.println(message1.trim());

        //concatenate the string variables
        String message2 = "Hi" + "Student";
        System.out.println(message2.length());
        System.out.println(message2.endsWith("k"));
        System.out.println(message2.startsWith("h"));
        System.out.println(message2.indexOf("i"));
        System.out.println(message2.replace("Hi", "Bye")); //Strings are immutable so it will return new string object


// escape sequences
        // quotes
        String message3 = "Hello \"Romina\"";
        System.out.println(message3);

        // backslash ( c:\Windows\... ) use an extra backslash
        String message4 = "c:\\Windows\\... ";
        System.out.println(message4);

        //using \n it will make a new line or \t will add a tab

// Array in Java - specify the length of the array with the (new int [];)
        int[] numbers = new int [5];
        // access by using an index
        // first item is 0
        numbers[0] = 1;
        numbers[2] = 2;
        System.out.println(numbers); // address of the object in memory

        // use the class arrays in the util package
        System.out.println(Arrays.toString(numbers));

        // newer array sintax
        int[] numbers1 = { 2, 3, 4, 5, 1, 4 };
        System.out.println(numbers1.length);
        System.out.println(Arrays.toString(numbers1));
        // Arrays have a fixed length
        // Use sort method of arrays class
        Arrays.sort(Arrays.toString(numbers1));


        // single dimensional array
        int[] numbers2 = new int[5];
        // multi-dimensional array - 2 by 3 matrix so two rows and three columns
        // specify the dimension by using the [] as many times as needed
        int[] [] numbers3 = new int[2][3];
        numbers3 [0][0] = 1;
        System.out.println(Arrays.deepToString(numbers3));

        // list of items { { }, { } };
        int[][] numbers4 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(numbers4));


// Constants eg: Pi
        final float PI = 3.14F;
// Arithmetic Expressions , operators( / ) and operands( 10, 3 )
        int result = 10 / 3;
        System.out.println(result);
// casting ie converting
        double result1 = (double)10 / (double)3;
        System.out.println(result1);

// increment / decrement operator
        int x = 1;
        x++; // post fix
        int y = ++x; // pre fix
// augmented assignment operators +=
// BODMAS : order of operators matters
        System.out.println(x);

// Implicit casting ie automatic done by java
        // byte can be converted into short
        // byte > short > int > long > float > double
        double x1 = 1.1;
        double y1 = x1 + 2;
        System.out.println(y1);

// Wrapper classes to help convert String to int/short/float/double etc.
        // parse method
        String x2 = "1";
        int y2 = Integer.parseInt(x2) + 2;
        System.out.println(y2);

// Math Class
        int result2 = Math.round(1.1F);
        System.out.println(result2);

        int result3 = (int)Math.ceil(1.1F);
        System.out.println(result3);

        int result4 = (int)Math.floor(1.1F); // the largest int that is larger or equal of the value
        System.out.println(result4);

        int result5 = Math.max(1, 2);
        System.out.println(result5);

        double result6 = Math.random() * 100;
        System.out.println(result6);

        int result7 = (int) Math.round(Math.random() * 100);
        System.out.println(result7);

// Formatting numbers
        // Can't create an instance of the number format because it's abstract
        // use .get like a factory method
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result8 = currency.format(1234567.891);
        System.out.println(result8);

        // method chaining
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result9 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result9);

// Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age1 = scanner.nextByte();
        System.out.println("You are " + age1);

        System.out.print("Name: ");
        String name1 = scanner.nextLine().trim(); // trim method to clear white space
        System.out.println("You are " + name1);

// Project

// Comparison Operators - used to compare primative values
        int x3 = 1;
        int y3 = 1;
        System.out.println(x3 == y3); // boolean answer true
        System.out.println(x3 );



// logical operators - combining multiple, will read from left to right
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
       // boolean isEligible = hasHighIncome || hasGoodCredit;

        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isEligible);


// If statements
    //       if temp is greater than 30
    //            it's a hot day
    //            drink plenty water
    //        otherwise, if it's between 20
    //          it's a nice day
    //          otherwise,
    //          it's cold
        int temp = 32;
        if(temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }

// Simplifying if statements

        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;

        // Better code
        int income1 = 120_000;
        boolean hasHighIncome = (income1 > 100_000);

// Ternary Operator
        int income2 = 120_000;
        String className = income2 > 100_000 ? "First" : "Economy"; // string variable, if the condition(income2 > 100_000) is true add string1 otherwise add string2


// Switch Statements
        String role = "admin";
        if (role == "admin")
            System.out.println("You're an admin");
        else if (role == "moderator")
            System.out.println("You're a moderator");
        else
            System.out.println("You're a guest");

        //     updated code block
        int role = 1;
        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }


// Loops
        for(int i = 0; i < 5; i++)
            System.out.println("Hello World!" + i);

        for(int i = 5; i > 0; i--)
            System.out.println("Hello World!" + i);

// While Loops
        int i  = 0;
        while (i > 0){
            System.out.println("Hello World!" + i);
            i--;
        }


        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }


// Do While loop
        do{
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while (!input.equals("quit"));


// Break and continue
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }


// For-Each Loop - for arrays
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);


    }
}
