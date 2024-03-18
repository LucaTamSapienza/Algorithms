package sortingAlgo;
public class MergeSort{
    public static void merge(int[] a, int start, int q, int end){

        int len_left = q - start + 1;
        int len_right = end - q;

        int[] left = new int[len_left];
        for (int i = 0; i < len_left; i++)
            left[i] = a[start + i];

        int[] right = new int[len_right];
        for (int i = 0; i < len_right; i++)
            right[i] = a[q + 1 + i];  // Modifica qui

        int i = 0, j = 0, k = start;  // Modifica qui
        while (i < len_left && j < len_right){
            if (left[i] <= right[j]){
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        //copio le parti finali dei due array
        while (i < len_left){
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < len_right){
            a[k] = right[j];
            j++;
            k++;
        }

    }

    public static void merge_sort_aux(int[] a, int start, int end){
        if (start >= end)
            return;
        int q = (start + end) / 2;

        merge_sort_aux(a, start, q);
        merge_sort_aux(a, q+1, end);
        merge(a, start, q, end);
        return;

    }

    public static void merge_sort(int[] a){
        merge_sort_aux(a, 0, a.length-1);
        return;
    }

}