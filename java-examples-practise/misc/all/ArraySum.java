public class ArraySum{
	public static void main(String[] args){
		//Initialize the array here
		int[] numbers = {10, 23, 45, 6, 8, 18, 4, 5};

		int sum =0;

		//find the sum here
		for(int i=0; i<numbers.length; i++){
			sum += numbers[i];
		}

		System.out.println("The sum of the provided numbers in an array is " + sum);
	}
}