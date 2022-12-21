import java.util.Arrays;

public class InsertionSort {
    public static void main (String[] args){
        int[] list = {4,3,2,5,9,6,3,21,42,4,3,6};
        System.out.println("Before Bubble sort\n");
        System.out.println(Arrays.toString(list));
        list = insertionSort(list);
        System.out.println("\nAfter Bubble sort");
        System.out.println(Arrays.toString(list));
    }
    public static int[] insertionSort(int[] list){
        if(list.length <2){
            return list;
        }
        for(int i =1; i<list.length;i++){
            int j = i-1;
            int current = list[i];
            while(j>-1 && list[j]>current){
                list[j+1] = list [j];
                j--;
            }
            list[j+1] = current;
        }
        return list;
    }
}


/**
 * Output
 Before Bubble sort

 [4, 3, 2, 5, 9, 6, 3, 21, 42, 4, 3, 6]

 After Bubble sort
 [2, 3, 3, 3, 4, 4, 5, 6, 6, 9, 21, 42]
 */