import java.util.Scanner;

public class ArraySumExtended{
	public static void main(String[] args){
		//Initialize the Scanner here
		Scanner input = new Scanner(System.in);

		//Initialize the array to store five numbers here
		int[] numbers = new int[5];

		//Initialize the sum here too.
		int sum = 0;

		//Allow the user to enter the numbers
		System.out.println("Hello, this program sums the numbers you enter. Please, enter any five numbers");
		for(int i=0; i<numbers.length; i++){
			//Accept the input here
			numbers[i] = input.nextInt();
			//then sum
			sum += numbers[i];
		}
		input.close();
		// Display the results here
		System.out.println("The sum of the numbers you entered is " + sum);
	}
}