package dsa.basics;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to convert into Binary");
		int num = sc.nextInt();
		decToBinary(num);
		
		decToBinaryUsingBitwise(num);
	}
	
	//using remainder
	public static void decToBinary(int number) {
		String binary = "";
		while(number>0) {
			binary = number%2+binary;
			number/=2;
		}
		
		System.out.println(binary);
	}
	
	//using bitwise operator
	public static void decToBinaryUsingBitwise(int number) {
		String binary = "";
		for(int i=31;i>=0;i--) {
			int k = number >> i;
			if((k & 1) > 0)
				binary += "1";
			else
				binary += "0";
		}
		System.out.println(binary);
	}

}
