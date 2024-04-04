package dsa.basics;

import java.util.ArrayList;
import java.util.List;

/*find the value of a power b i.e a^b
*instead of going with the normal approach where we can multiply a, b times which would be of O(n) complexity
*we are using the formula - a^b => a^b/2 * a^b/2 when b is even and a*a^b/2*a^b/2 when b is odd
*so, 2^1024 => (2^512)^2 , and then 2^512 => (2^256)^2 ...so on, which will go for 11 iterations only
*instead of 1024 iterations unlike normal way
*/

public class PowerOf {

	public static void main(String args[]) {
		
		System.out.println(powerUsingRecursion(2,-3));
		
		System.out.println(powerUsingLoop(2,-3));
	}
	
	public static double powerUsingRecursion(double a, int b) {
//		System.out.println(b);
		if(b==0)
			return 1;
		if(b==1)
			return a;
		if(b==-1) 
			return 1/a;

			
		double prod = powerUsingRecursion(a, b/2);
		System.out.println(b+"a ="+a+" prod "+prod);
		if(b%2==0)
			return prod*prod;
		else if(b<0)
			return 1/a*prod*prod;
		else
			return a*prod*prod;
	}
	
	//below is the example of executing the same using loop, but this solution takes more space complexity
	//because of storing list integer.
	public static double powerUsingLoop(int a, int b) {
		
		List<Integer> li = new ArrayList<>();
		//min val of integer 2^31, while max val of integer is 2^31-1, so when we will use 
		//Math.abs(-2147483648), it won't give us 2147483648 and hence will give wrong output
		//to handle this case explicitly I'm storing it. and then going for next val of it, i.e b/2
		if(b==-2147483648){ 
            b/=2;
            li.add(b);
        }
		int pow = Math.abs(b);
		while(pow>1) {
			li.add(pow);
			pow/=2;
		}
		double prod = a;
		for(int i=li.size()-1;i>=0;i--) {
//			System.out.println(li.get(i));
			if(li.get(i)%2==0)
				prod*=prod;
			else
				prod=a*prod*prod;
			
		}
		if(b<0)
			prod=1/prod;
		return prod;
		
	}
}
