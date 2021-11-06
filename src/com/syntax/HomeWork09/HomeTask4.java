package com.syntax.HomeWork09;

public class HomeTask4 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array
		int[] nums = { 3, 6, 14, 18, 96, 120, 135 };
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("The sum of numbers in array is " + sum);

		int sum2 = 0;
		for (int num : nums) {
			sum2 += num;
		}
		System.out.println("The sum of numbers in array is " + sum2);
		System.out.println("___________________________________");
	
		
		}
	}

