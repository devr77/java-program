import java.util.Arrays;

public class QuickSort {

    static int count = 0;

    public static void main(String[] args) {

        QuickSort obj = new QuickSort();

        Comparable[] array = {4,3,2,5,9,6,3,21,42,4,3,6};
        System.out.println("Before Quick sort\n");
        System.out.println(Arrays.toString(array));
        obj.quickSort(array);
        System.out.println("\nAfter Quick sort");
        System.out.println(Arrays.toString(array));

    }//main

    public int quickSort(Comparable[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private int quickSort(Comparable[] arr, int start, int end) {
        if (start < end) {
            int q = partition(arr, start, end);
            quickSort(arr, start, q - 1);
            quickSort(arr, q + 1, end);

        }
        return count;

    } //quickSort

    private int partition(Comparable[] array, int begin, int last) {
        Comparable pivot = array[last];

        int i = begin - 1;

        for (int j = begin; j <= last - 1; j++) {
            count++;
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                Comparable temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        Comparable temp_2 = array[i + 1];
        array[i + 1] = array[last];
        array[last] = temp_2;

        return i + 1;

    }//partition
}