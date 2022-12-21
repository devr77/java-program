
public class MergeSort{

    private static void merge(int[] numbers, int first, int n1, int n2){
        int[] temp = new int[n1+n2];
        int copied = 0, copied1 = 0, copied2 = 0;
        while((copied1 < n1) && (copied2 < n2)){
            if (numbers[first + copied1] < numbers[first + n1 + copied2])
                temp[copied++] = numbers[first + copied1++];
            else
                temp[copied++] = numbers[first + n1 + copied2++];
        }

        while(copied1 < n1)
            temp[copied++] = numbers[first + copied1++];
        while(copied2 < n2)
            temp[copied++] = numbers[first + n1 +copied2++];

        for(int i = 0; i < n1+n2; i++)
            numbers[first + i] = temp[i];
    }

    public static void mergeSort(int[] numbers, int first, int last){
        int n1, n2;
        if (last > 1){
            n1 = last/2;
            n2 = last - n1;

            mergeSort(numbers, first, n1);
            mergeSort(numbers, first + n1, n2);

            merge(numbers, first, n1, n2);
        }
    }

    public static void printArray(int[] numbers){
        System.out.print("Numbers: ");
        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        int[] list = {4,3,2,5,9,6,3,21,42,4,3,6};
        System.out.println("Before Merge sort");
        printArray(list);
        System.out.println("\nAfter Merge sort");

        mergeSort(list, 0, list.length);
        printArray(list);


    }
}

/**
 * Output
 Before Merge sort
 Numbers: 4 3 2 5 9 6 3 21 42 4 3 6 

 After Merge sort
 Numbers: 2 3 3 3 4 4 5 6 6 9 21 42 
 */