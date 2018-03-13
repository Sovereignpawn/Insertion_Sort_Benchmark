/*
File Name: UnsortedException.java
Date: 02-04-2018
Author: Barrett Otte
Purpose: Displays a message when an array is found to be unsuccessfully sorted.
*/
public class UnsortedException extends Exception{
    public UnsortedException(){}
    
    public UnsortedException(String msg){
        super(msg);
    }
}