import java.util.Arrays;

/**
 * Created by ProgrammingKnowledge.
 */
public class SelectionSort {

    public static int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }



    public static void main(String a[]){

        int[] list = {4,3,2,5,9,6,3,21,42,4,3,6};
        System.out.println("Before Selection sort\n");
        System.out.println(Arrays.toString(list));
        list = doSelectionSort(list);
        System.out.println("\nAfter Selection sort");
        System.out.println(Arrays.toString(list));

    }
}

/**
 * Output
 Before Selection sort

 [4, 3, 2, 5, 9, 6, 3, 21, 42, 4, 3, 6]

 After Selection sort
 [2, 3, 3, 3, 4, 4, 5, 6, 6, 9, 21, 42]
 */