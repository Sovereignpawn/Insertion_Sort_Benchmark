/*
File Name: InsertionSort.java
Date: 02-04-2018
Author: Barrett Otte
Purpose: Implementation of both the recursive and iterative versions of the
         insertion sorting algorithm.
*/

public class InsertionSort implements SortInterface{
    
    private int count;
    private long time;
    
    public InsertionSort(){
        count = 0;
        time = 0;
    }
    
    
    //This method is modified from my week 2 discussion
    public int[] iterativeSort(int[] data){
        int tmp;
        long startTime = System.nanoTime();
        
        for(int i = 1; i < data.length; i++){
            for(int j = i; j > 0; j--){
                if(data[j] < data[j-1]){
                    tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tmp;
                }
                count++;
            }
        }
        time = System.nanoTime() - startTime;
        return data;
    }
    
    /*Helper method to preserve the time variable's accuracy*/
    public int[] recursiveSort(int[] data){
        long startTime = System.nanoTime();
        data = recursiveSortHelper(data, data.length);
        time = System.nanoTime() - startTime;
        return data;
    }
    
    
    //This method is from:
    //      https://www.geeksforgeeks.org/recursive-insertion-sort/
    private int[] recursiveSortHelper(int[] data, int n){
        if(n <= 1){
            return data;
        }
        recursiveSortHelper(data, n-1);
        int last = data[n-1];
        int j = n - 2;
        while(j >= 0 && data[j] > last){
            data[j+1] = data[j];
            j--;
            count++;
        }
        data[j+1] = last;
        return data;
    }
    
    
    public int getCount(){
        return count;
    }
    public long getTime(){
        return time;
    }  
}