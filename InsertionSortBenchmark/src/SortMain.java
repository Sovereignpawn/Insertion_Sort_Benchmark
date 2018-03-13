/*
File Name: SortMain.java
Date: 02-04-2018
Author: Barrett Otte
Purpose: This class is used as a driver to perform the benchmarking for the
           insertion sort algorithm. It also defines the data sizes to be used
           in the testing.
*/

public class SortMain {
    
    public static void main(String[] args){
        int[] cases = {5, 10, 25, 50, 75, 100, 200, 300, 400, 500};
        int trials = 50;
        
        //Code from http://www.baeldung.com/java-jvm-warmup to properly warmup the jvm
        System.out.println("Performing JVM Warmup to ensure the test's accuracy.");
        long start = System.nanoTime();
        ManualClassLoader.load();
        long end = System.nanoTime();
        System.out.println("Warm Up time : " + (end - start) + " ns\n");
     
        BenchmarkSorts benchmarkDriver = new BenchmarkSorts(cases, trials);
        benchmarkDriver.runSorts();
        benchmarkDriver.displayReport();
    }
}