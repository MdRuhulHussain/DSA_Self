package dsa.basics;

import java.util.Scanner;

/*
 * Program to print nth element of fibonacci series - 0,1,1,2,3,5,8,13
 */
public class Fibonacci {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
		System.out.println(getNthfib(n));
	}
	
	public static int getNthfib(int n) {
		
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		
		return getNthfib(n-1)+getNthfib(n-2);
	}

}