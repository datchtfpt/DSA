package Sorting.InsertionSort;

import Sorting.BubbleSort.BubbleSort;

import java.util.Arrays;

public class InsertionSort {

    public void sort(int[] a){
        int temp = 0;
        for(int i = 1; i < a.length; i++){
            int currentIndex = i;
            int behindIndex = i - 1;
            while(behindIndex >= 0 && a[behindIndex] > a[currentIndex]){
                temp = a[currentIndex];
                a[currentIndex] = a[behindIndex];
                a[behindIndex] = temp;
                currentIndex = behindIndex;
                behindIndex--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {99,9,0,1,1,1,99,99,99};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        System.out.println(Arrays.toString(arr));


    }


}
