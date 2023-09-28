package dsa.basics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Stream;

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
		binary.length();
		String[] arr = {"123", "4445", "kdfjkj", "kd", "kdkdjkdjkd"};
		Collections.sort(Arrays.asList(arr), Comparator.comparingInt(String :: length).reversed());
		for(String val : arr)
			System.out.println(val);
//		Stream.of(arr).sorted(Comparator.comparingInt(String :: length).reversed());
		System.out.println(binary);
	}

}
