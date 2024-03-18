package searchAlgo;

public class FindMax {
    public static int find_max(int[] a){
        return RandomizedSelect.randomized_select(a, a.length - 1);
    }
}
