/*
File Name: SortInterface.java
Date: 02-04-2018
Author: Barrett Otte
Purpose: Interface used for benchmarking sorting algorithms.
*/
public interface SortInterface {
    public int[] iterativeSort(int[] data);
    public int[] recursiveSort(int[] data);
    public int getCount();
    public long getTime();
}