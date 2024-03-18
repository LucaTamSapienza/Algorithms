package sortingAlgo;

import java.util.Arrays;

public class QuickSort {
    // Return the index of the pivot
    public int partition(int[] a, int start, int end){
        // getting as pivot the last element of the array
        int pivot = a[end];
        int i = start;
        for (int j = start; j < end; j++){
            if (a[j] < pivot) {
                // change a[i] with a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        // change a[i+1] with pivot
        int temp = a[i];
        a[i] = a[end];
        a[end] = temp;
        return i;
    }

    public void quick_sort_aux(int[] a, int start, int end){
        if (start < end) {
            int q = partition(a, start, end);
            quick_sort_aux(a, start, q - 1);
            quick_sort_aux(a, q + 1, end);
        }
    }

    public void quick_sort(int[] a){
        quick_sort_aux(a, 0, a.length - 1);
    }
}
