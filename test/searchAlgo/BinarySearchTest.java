package searchAlgo;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    private final int[] a = {1, 2, 2, 3, 4, 5, 9, 10, 11, 45, 79};

    @Test
    public void test_binary_search(){
        int x = 4;
        boolean expected = true;
        boolean actual = BinarySearch.binary_search(a, x);
        assertEquals(expected, actual);
    }

    @Test
    public void test_binary_search_last(){
        int x = 79;
        boolean expected = true;
        boolean actual = BinarySearch.binary_search(a, x);
        assertEquals(expected, actual);
    }

    @Test
    public void test_binary_search_first(){
        int x = 1;
        boolean expected = true;
        boolean actual = BinarySearch.binary_search(a, x);
        assertEquals(expected, actual);
    }

    @Test
    public void test_binary_search_not_found(){
        int x = 100;
        boolean expected = false;
        boolean actual = BinarySearch.binary_search(a, x);
        assertEquals(expected, actual);
    }
}
