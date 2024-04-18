package com.logics;


	import java.util.Arrays;
	import java.util.Comparator;

	public class ReturnLargestNumber {
	    public static void main(String[] args) {
	        int[] numbers = {9, 6, 72};

	        String largestNumber = findLargestNumber(numbers);

	        System.out.println("The largest number is: " + largestNumber);
	    }

	    public static String findLargestNumber(int[] numbers) {
	        // Convert integers to strings
	        String[] numStrings = new String[numbers.length];
	        for (int i = 0; i < numbers.length; i++) {
	            numStrings[i] = String.valueOf(numbers[i]);
	        }

	        // Custom comparator to sort strings based on their concatenated forms
	        Comparator<String> comparator = (a, b) -> (b + a).compareTo(a + b);

	        // Sort the strings using the custom comparator
	        Arrays.sort(numStrings, comparator);

	        // Concatenate the sorted strings to get the largest number
	        StringBuilder sb = new StringBuilder();
	        for (String numString : numStrings) {
	            sb.append(numString);
	        }

	        return sb.toString();
	    }
	}

