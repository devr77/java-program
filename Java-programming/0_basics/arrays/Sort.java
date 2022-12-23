public class Sort {
    
    public static void selectionSort(int[] list) {
        for (int i = list.length - 1; i >= 1; i--) {
            int currentMax = list[0];
            int currentMaxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
    public static void main(String[] args) {
        int[] list = {79,4,7,60,59,45,50,11,10,66,70,2};
        selectionSort(list);
        for (int item : list) {
            System.out.print(item +", ");
        }
    }
}