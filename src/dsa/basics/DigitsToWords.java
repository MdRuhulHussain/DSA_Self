package dsa.basics;

import java.util.Scanner;


public class DigitsToWords {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to convert into word");
		int n = sc.nextInt();
		String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		digitToWord(n, arr);
	}
	
	//function to convert 123 into one two three
	public static void digitToWord(int n, String[] arr) {
		
		if(n==0)
			return ;
		int digit = n%10;
		n/=10;
		System.out.print(arr[digit]+" ");  //will print in reverse order because of printing during every recursion
		digitToWord(n,arr);
		System.out.print(arr[digit]+" "); //will print in order because printing post recursion execution, i.e after value is released from recursion
	}

}
