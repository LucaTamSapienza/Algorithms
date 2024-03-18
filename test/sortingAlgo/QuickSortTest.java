package sortingAlgo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    private final QuickSort quickSort = new QuickSort();

    @Test
    public void quick_sort_test_even(){
        int[] a = new Random().ints(20, 0, 100).toArray();
        //System.out.println("original = " + Arrays.toString(a));
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        quickSort.quick_sort(a);
        //System.out.println("expected = " + Arrays.toString(sorted_copy));
        //System.out.println("result = " + Arrays.toString(a));
        assertArrayEquals(sorted_copy, a);
    }


    @Test
    public void quick_sort_test_odd(){
        int[] a = new Random().ints(21, 0, 100).toArray();
        //System.out.println("original = " + Arrays.toString(a));
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        quickSort.quick_sort(a);
        //System.out.println("expected = " + Arrays.toString(sorted_copy));
        //System.out.println("result = " + Arrays.toString(a));
        assertArrayEquals(sorted_copy, a);
    }

    @Test
    public void quick_sort_test_reverse(){
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        //System.out.println("original = " + Arrays.toString(a));
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        quickSort.quick_sort(a);
        //System.out.println("expected = " + Arrays.toString(sorted_copy));
        //System.out.println("result = " + Arrays.toString(a));
        assertArrayEquals(sorted_copy, a);
    }
}
