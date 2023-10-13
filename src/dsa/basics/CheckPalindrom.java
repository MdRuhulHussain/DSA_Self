package dsa.basics;

public class CheckPalindrom {
	
	/*
	 * Program to check if given string is palindrom or not.
	 */
	public static void main(String args[]) {
		String str = "abcdefghiihgfedcba";
		
		System.out.println(checkPalindromUsingRecursion(str, 0, str.length()-1));
		
		System.out.println(checkPalindromUsingLoop(str));
	}
	
	//using recursion
	public static boolean checkPalindromUsingRecursion(String str, int i, int j) {
		if(i>j)
			return true;
		if(str.charAt(i)!=str.charAt(j))
			return false;
		i++;
		j--;
		return checkPalindromUsingRecursion(str, i, j );
	}

	//using loop
	public static boolean checkPalindromUsingLoop(String str) {
		
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
						
		}
		return true;
	}
}
