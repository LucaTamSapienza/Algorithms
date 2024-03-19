package sortingAlgo;

// TODO review int[] -> void return statement
public class CountingSort {
    public int[] counting_sort(int[] a, int k){
        int[] ris = new int[a.length];
        int[] c = new int[k];
        for (int j : a) c[j] += 1;
        for (int i = 1; i < k; i++)
            c[i] += c[i-1];
        for (int i = a.length; i > 0; i--){
            ris[c[a[i]]] = a[i];
            c[a[i]] -= 1;
        }
        return ris;
    }
}
