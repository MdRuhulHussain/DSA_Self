package dsa.basics;

/* Following two approaches to reverse a string
 * 1. Using Recursion
 * 2. Using Loop
 */
public class ReverseString {
	
	public static void main(String args[]) {
		
		String str = "ThisIsToDemonstrateReverseString";
		
		System.out.println(reverseStringRecursion(str, 0, str.length()-1, "", ""));
		
		System.out.println(reverseStringLoop(str, str.length()));
	}
	
	//using recursion
	public static String reverseStringRecursion(String str, int i, int j, String p1, String p2) {
		
		if(i>=j) {
			if(i==j)
				p1=str.charAt(i)+p1;
			return p2+p1;
		}
		
		p1 = str.charAt(i) +p1;
		p2 = p2+str.charAt(j);
		
		return reverseStringRecursion(str, ++i, --j, p1, p2);
	}
	
	//using loop
	public static String reverseStringLoop(String str, int len) {
		String p1 ="", p2 = "";
		int j=len-1, i;
		for(i=0;i<len/2;i++) {
			p1 = str.charAt(i)+p1;
			p2+= str.charAt(j);
			j--;
		}
		if(i==j)
			p1=str.charAt(i)+p1;
		return p2+p1;
	}

}
