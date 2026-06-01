package com.fudn.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {


    public void swap(int value1, int value2){
        int temp = value1;
        value1 = value2;
        value2 = temp;
    }

    public int[] sort(int[] a){

        boolean flag;
        int len = a.length;
        do {
            flag = false;
            len--;
            for (int i = 0; i < len; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = true;
                }
            }

        }while(flag);

        return a;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] array = {1,1,1,1,1,2,1,1,1,13};

        System.out.println("Before sort: " + Arrays.toString(array));

        System.out.println("After sort: " + Arrays.toString(bubbleSort.sort(array)));

    }
}
