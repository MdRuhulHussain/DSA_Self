package dsa.basics;

public class BinarySearch {
	
	public static void main(String args[]) {
		int arr[] = {2,4,7,15,18,22,27,30,34,38}; //sorted array
		
		int key = 30;
		System.out.println("at index "+binarySearchRecursion(arr, 0, arr.length-1, key)+" using recursion");
		
		
		System.out.println("at index "+binarySearchLoop(arr, 0, arr.length-1, key)+" using loop");
		
	}
	
	//using recursion
	public static int binarySearchRecursion(int[] arr, int start, int end, int key) {
		if(start > end)
			return -1;
		int mid = (start+end)/2;
		
		if(arr[mid] == key)
			return mid;
		
		if(arr[mid] < key)
			return binarySearchRecursion(arr, mid+1, end, key);
		else
			return binarySearchRecursion(arr, start, mid-1, key);
		
		
	}
	
	//using loop
	public static int binarySearchLoop(int[] arr, int start, int end, int key) {
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(arr[mid] == key)
				return mid;
			if(arr[mid] < key)
				start = mid+1;
			else
				end = mid-1;
		}
		return -1;
	}

}
