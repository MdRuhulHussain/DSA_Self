package dsa.basics;


/*
 * Check if given array is sorted or not
 * 1. Using Recursion
 * 2. Using Loop
 */
public class IsSorted {
	
	public static void main(String args[]) {
		
		int[] arr = {34,56,65,78,82,55,93};
		
		//calling recursion method and printing output
		if(isSortedUsingRecursion(arr, 0))
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");
		
		
		//using loop
		if(isSortedUsingLoop(arr))
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");
		
		
	}
	
	public static boolean isSortedUsingRecursion(int[] arr, int index) {
		
		if(index==arr.length-1)
			return true;
		if(arr[index]>arr[index+1])
			return false;
		return  isSortedUsingRecursion(arr, index+1);
		
	}
	
	public static boolean isSortedUsingLoop(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1]) {
				return false;
			}	
		}
		return true;
	}

}
