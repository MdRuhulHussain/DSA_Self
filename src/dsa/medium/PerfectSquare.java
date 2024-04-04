package dsa.medium;

public class PerfectSquare {
	
	public static void main(String args[]) {
		System.out.println(square_root(808201));
	}
	
	public static long square_root(int N)
    {
        // Find MSB(Most significant Bit) of N
        int msb = (int)(Math.log(N) / Math.log(2));
 
        // (a = 2^msb)
        int a = 1 << msb;
        long result = 0L;
        while (a != 0) {
 
        	System.out.println(a+"-------"+result);
            // Check whether the current value
            // of 'a' can be added or not
        	long val = (result + a) * (result + a);
            if (val <= N) {
            	if(val==N)
            		return result+a;
                result += a;
            }
 
            // (a = a/2)
            a >>= 1;
        }
 
        // Return the result
        return -1;
    }

}
