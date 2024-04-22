package com.logics;

public class Zero {
	    public static void main(String[] args) {
	        // Record the start time
	        long startTime = System.currentTimeMillis();

	        // Code to be executed
	        int i = 4;
	        while (i < 10) {
	            i--; // Decrement i until it becomes less than 10 (which is never in this case)
	        }
	        System.out.print(i + " "); // Print the value of i after the loop

	        // Record the end time
	        long endTime = System.currentTimeMillis();

	      
	        // Print the elapsed time
	        System.out.println("\nTime taken to execute code: " +( endTime - startTime) + " milliseconds");
	    }
}