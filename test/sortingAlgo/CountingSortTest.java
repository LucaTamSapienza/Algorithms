package sortingAlgo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

// TODO k instance
public class CountingSortTest {
    private final CountingSort countingSort = new CountingSort();
    @Test
    public void test_counting_sort_even(){
        int[] a = new Random().ints(100, 0, 100).toArray();
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        countingSort.counting_sort(a, 100);
        assertArrayEquals(sorted_copy, a);
    }

    @Test
    public void test_counting_sort_odd(){
        int[] a = new Random().ints(101, 0, 100).toArray();
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        countingSort.counting_sort(a, 101);
        assertArrayEquals(sorted_copy, a);
    }
}
