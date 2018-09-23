/*
File Name: ManualClassLoader.java
Date: 02-04-2018
Author: Barrett Otte
Purpose: Code from http://www.baeldung.com/java-jvm-warmup used to warm up the
         jvm before performing the benchmark.
*/

public class ManualClassLoader {
    protected static void load() {
        for (int i = 0; i < 100000; i++) {
            Dummy dummy = new Dummy();
            dummy.m();
        }
    }
}

class Dummy {
    public void m() {}
}