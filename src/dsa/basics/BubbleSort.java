package dsa.basics;

/*In Bubble sort, we will iterate for multiple rounds i.e (n-1)rounds to carry the max value among 0th index to 
 * (nth-round)index elements to the last. which means if sorting an array of 5 elements, the first round will 
 * compare elements from 0 index to 4 index (i.e all elements) and the max among them will be sent to last index
 * of the array and so on.
 * eg. 6,0,3,5 
 * round 1 => 0,6,3,5 -> 0,3,6,5 -> 0,3,5,6
 * round 2 => 0,3,5,6 -> 0,3,5,6 -> 0,3,5,6
 * round 3 => no need to iterate, on identifying that no element was swapped in round 2, we can identify that the
 * array is already sorted and so we can break the outer loop after executing the round 2 of inner loop
 * If 
 */
public class BubbleSort {
	
	public static void main(String args[]) {
		
		int[] arr = {24,29,37,10,38,67,25,13,44,56,70,83,95};
		//{29,10,25,13,37,44} -> {10,25,13,29,37,44} -> {10,13,25,29,37,44} -> {10,13,25,29,37,44}
//		arr = bubbleSortLoop(arr);
//		
//		for(int elem : arr)
//			System.out.print(elem+" ");
		
		int[] arr2 = bubbleSortRecursion(arr, 1, arr.length);
		
		for(int elem : arr2)
			System.out.print(elem+" ");
	}
	
	//using Recursion
	public static int[] bubbleSortRecursion(int[] arr, int round, int n) {
		if(round==n)
			return arr;
		System.out.println("printing iteration "+round);
		int temp;
		boolean swapped = false;
		for(int j=0;j<n-round;j++) {
			if(arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swapped = true;
			}
				
		}
		if(swapped)
			bubbleSortRecursion(arr, round+1, n);
		return arr;
	}
	
	//using loop
	public static int[] bubbleSortLoop(int[] arr) {
		int n = arr.length;
		int temp;
		for(int round=1;round<n;round++) {
			System.out.println("printing iteration "+round);
			boolean swapped = false;
			for(int j=0;j<n-round;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
					
			}
			if(!swapped)
				break;
				//array sorted
		}
		return arr;
	}

}
