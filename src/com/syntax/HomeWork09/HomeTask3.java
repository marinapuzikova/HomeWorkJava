package com.syntax.HomeWork09;

public class HomeTask3 {

	public static void main(String[] args) {
		// Create an array to store double values and then print those in reverse order

		double[] nums = { 20.55, 31.80, 15.63, 10.05, 47.80 };

		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);

		}
	}
}
//we can not use enhanced loop to travel back in array, because its always go in one direction++
