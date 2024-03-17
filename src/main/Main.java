package main;

import searchAlgo.*;
import sortingAlgo.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random ran = new Random();
        int[] a = new int[ran.nextInt(20)];
        for (int i = 0; i < a.length; i++)
            a[i] = ran.nextInt(20);
        System.out.println("Array a = " + Arrays.toString(a) + "\nlength = " + a.length);
        System.out.println("=====MergeSort====");
        System.out.println("Before sorting = " + Arrays.toString(a));
        MergeSort.merge_sort(a);
        System.out.println("After sorting = " + Arrays.toString(a));
        System.out.println("=====End MergeSort====");

        System.out.println("=====BinarySearch====");
        int x = ran.nextInt(20);
        System.out.println("a = " + Arrays.toString(a) + "\nx = " + x);
        System.out.println(BinarySearch.binary_search(a, x));
        System.out.println("=====End BinarySearch====");

    }
}