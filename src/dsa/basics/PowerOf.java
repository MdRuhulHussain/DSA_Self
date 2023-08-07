package dsa.basics;

import java.util.ArrayList;
import java.util.List;

public class PowerOf {

	public static void main(String args[]) {
		//find the value of a power b i.e a^b
		//instead of going with the normal approach where we can multiply a, b times which would be of O(n) complexity
		//we are using the formula - a^b => a^b/2 * a^b/2 when b is even and a*a^b/2*a^b/2 when b is odd
		//so, 2^1024 => (2^512)^2 , and then 2^512 => (2^256)^2 ...so on, which will go for 11 iterations only
		//instead of 1024 iterations unlike normal way
		System.out.println(powerUsingRecursion(2,39));
		
		System.out.println(powerUsingLoop(2,39));
	}
	
	public static long powerUsingRecursion(int a, int b) {
//		System.out.println(b);
		if(b==0)
			return 1;
		if(b==1)
			return a;
		long prod = powerUsingRecursion(a, b/2);
		
		if(b%2==0)
			return prod*prod;
		else
			return a*prod*prod;
	}
	
	//below is the example of executing the same using loop, but this solution takes more space complexity
	//because of storing list integer.
	public static long powerUsingLoop(int a, int b) {
		
		List<Integer> li = new ArrayList<>();
		while(b>1) {
			li.add(b);
			b/=2;
		}
		long prod = a;
		for(int i=li.size()-1;i>=0;i--) {
//			System.out.println(li.get(i));
			if(li.get(i)%2==0)
				prod*=prod;
			else
				prod=a*prod*prod;
			
		}
		return prod;
//		int prod = b%2==0?a:1;
//		int temp = b;
//		while(b>0) {
////			if(b==1)
////				return prod*=a;
//			if(b%2==0)
//				prod*=prod;
//			else if(temp%2==0 && b==1)
//				return prod;
//			else
//				prod*=a*prod;
//			b/=2;
//		}
//		
//		return prod;
		
	}
}
