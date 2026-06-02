
package Sorting.SelectionSort;



import java.util.Arrays;

public class SelectionSort {

    public void sort(int[] arr) {
        int indexRight = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= min && arr[j] < min) {
                    min = arr[j];
                    indexRight = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexRight];

        }
    }

    // 1 6 5 3 2 7

    public static void main(String[] args) {
        //BubbleSort bubbleSort = new BubbleSort();

        int[] array = {1,4,5,3,9,7};

        System.out.println("Before sort: " + Arrays.toString(array));

        //System.out.println("After sort: " + Arrays.toString(bubbleSort.sort(array)));

    }
}
