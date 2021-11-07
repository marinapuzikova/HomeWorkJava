package com.syntax.HomeWork12;

public class PrimeNumber {
	//Write a method to return whether given number is prime or not?
void checkPrime(int num, boolean prime) {
	if (num>1) {
		for (int i =2;i<num;i++) {
			if(num%i==0) {
				prime= false;
				break;
			}
			
		}
	}else {
		prime=false;
	}
if(prime) {
	System.out.println(num+" is a prime number");
}else{
	System.out.println(num+"is not a prime number");
}
}

}
