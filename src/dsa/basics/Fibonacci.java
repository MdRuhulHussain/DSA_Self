package dsa.basics;

import java.util.Scanner;

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