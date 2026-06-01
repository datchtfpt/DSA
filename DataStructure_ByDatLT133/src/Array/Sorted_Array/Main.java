package com.fudn.Array.Sorted_Array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[] arr = {1,2,4,6,10};
    public static void update(int index, int value){
        arr[index] = value;
        while(index < arr.length - 1 && arr[index] > arr[index + 1]){
            arr[index] = arr[index + 1];
            arr[index + 1] = value;
            index++;
        }

        while(index > 0 && arr[index] < arr[index -1]){
            arr[index] = arr[index - 1];
            arr[index - 1] = value;
            index--;
        }
    }

    public static void add(int value){
        int lengFilled = 0;
        for(int i = 0; i < arr.length; i++){
            lengFilled++;
        }
        if(lengFilled == arr.length){
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        System.out.println(lengFilled);
            arr[lengFilled] = value;
            while(arr[lengFilled - 1] > value && lengFilled > 0){
                arr[lengFilled] = arr[lengFilled - 1];
                arr[lengFilled - 1] = value;
                lengFilled--;
            }
    }

    public static void main(String[] args) {

        Arrays.sort(arr);
        //update(3,-1);
        add(3);
        System.out.println(Arrays.toString(arr));

    }
}

// 1 2 3(8) 4 5