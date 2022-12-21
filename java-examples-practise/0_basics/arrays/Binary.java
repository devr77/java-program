public class Binary {
    
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

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1 - low;
    }

    public static void main(String[] args) {
        int[] list = {79,4,7,60,59,45,50,11,10,66,70,2};
        selectionSort(list);
        int index = binarySearch(list, 50);
        System.out.println("Index of 50: "+ index);
    }
}