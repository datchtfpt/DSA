package Sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {


    public void mergeSort(int[] a, int left, int right) {
        if(left == right){
            return;
        }
        System.out.println(Arrays.toString(a));
        int mid = (left + right)/2;
        mergeSort(a,left, mid);
        mergeSort(a,mid+1,right);
        merge(a,left,mid,right);
    }

    public void merge(int[] a, int left, int mid, int right){
        int[] l = Arrays.copyOfRange(a,left,mid + 1);
        int[] r = Arrays.copyOfRange(a,mid + 1,right + 1);
        System.out.println("l: " + Arrays.toString(l));
        System.out.println("r: " + Arrays.toString(r));
        int i = 0, j = 0, index = left;
        while(i < r.length && j < l.length){
            if(r[i] < l[j]){
                a[index++] = r[i];
                System.out.println("r < l" + i + " " + j);
                i++;
            }
            else{
                a[index++] = l[j];
                System.out.println("r > l" + i + " " + j);
                j++;
            }
        }

        while(i < r.length){
            a[index++] = r[i];
            i++;
        }
        while(j < l.length){
            a[index++] = l[j];
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,1};

        MergeSort mergeSort = new MergeSort();

        mergeSort.mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
}
