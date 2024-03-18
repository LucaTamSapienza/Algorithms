package sortingAlgo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

// TODO
public class CountingSortTest {
    @Test
    public void test_counting_sort_even(){
        int[] a = new Random().ints(100, 0, 100).toArray();
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        CountingSort.counting_sort(a, 0);
        assertArrayEquals(sorted_copy, a);
    }

    @Test
    public void test_counting_sort_odd(){
        int[] a = new Random().ints(101, 0, 100).toArray();
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        CountingSort.counting_sort(a, 0);
        assertArrayEquals(sorted_copy, a);
    }
}
