package sortingAlgo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void test_merge_sort_even(){
        int[] a = new Random().ints(100, 0, 100).toArray();
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        MergeSort.merge_sort(a);
        assertArrayEquals(sorted_copy, a);
    }

    @Test
    public void test_merge_sort_odd(){
        int[] a = new Random().ints(101, 0, 100).toArray();
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        MergeSort.merge_sort(a);
        assertArrayEquals(sorted_copy, a);
    }

    @Test
    public void test_merge_sort_reverse(){
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] sorted_copy = a.clone();
        Arrays.sort(sorted_copy);
        MergeSort.merge_sort(a);
        assertArrayEquals(sorted_copy, a);
    }
}
