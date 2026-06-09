package Sorting.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortVer2 {

    public ArrayList<Integer> mergeSort(ArrayList<Integer> a) {
        if (a.size() < 2) return a;
        int mid = a.size() / 2;
        System.out.println(a.size());

        ArrayList<Integer> b = mergeSort(new ArrayList<>(a.subList(0, mid)));
        ArrayList<Integer> c = mergeSort(new ArrayList<>(a.subList(mid, a.size())));
        System.out.println(b);
        System.out.println(c);

        a.clear();
        while (!b.isEmpty() && !c.isEmpty()) {
            if (b.getFirst() < c.getFirst()) {
                a.add(b.getFirst());
                b.removeFirst();
            } else {
                a.add(c.getFirst());
                c.removeFirst();
            }
        }

        a.addAll(b);
        a.addAll(c);

        return a;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,9,100,20,7,9};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        MergeSortVer2 mergeSort = new MergeSortVer2();

        System.out.println(list);
        System.out.println(mergeSort.mergeSort(list));

    }
}
