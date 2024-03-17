package searchAlgo;

public class BinarySearch {
    public static boolean binary_search(int[] a, int x){
        return binary_search_aux(a, x, 0, a.length - 1);
    }

    private static boolean binary_search_aux(int[] a, int x, int start, int end) {
        if (start >= end)
            return false;
        int p = (start + end) / 2;
        if (a[p] == x)
            return true;
        else if (a[p] < x)
            return binary_search_aux(a, x, p+1, end);
        else
            return binary_search_aux(a, x, start, p);
    }
}
