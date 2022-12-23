public class BubbleSort {
    public static void main(String[] args)
    {
        int[] c={154,58,5,542,5,84,96,35,954,269,516,169,503,85,695,415,492};//
        System.out.print("Before Bubble sort \n");
        printA(c);
        bubble(c);
        System.out.print("\nAfter Bubble sort \n");
        printA(c);
    }
    public static void printA(int[] a)
    {
        for(int i=0 ; i< a.length; i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
    public static void bubble(int[] a)
    {
        int temp = 0;
        for(int i =a.length;i>=0; i--)
        {
            for(int j=0;j< i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }

        }

    }
}

/**
 * Output
 Before Bubble sort
 154  58  5  542  5  84  96  35  954  269  516  169  503  85  695  415  492
 After Bubble sort
 5  5  35  58  84  85  96  154  169  269  415  492  503  516  542  695  954
 */