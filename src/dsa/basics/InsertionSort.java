package dsa.basics;


/*
 * To sort an array of size N in ascending order iterate over the array and compare 
 * the current element (key) to its predecessor, if the key element is smaller than
 *  its predecessor, compare it to the elements before. Move the greater elements 
 *  one position up to make space for the swapped element.
 */
public class InsertionSort {
	
	public static void main(String args[]) {
		
		int[] arr = {8,3,7,5,2,11,17,6};
		
		arr = insertionSort(arr);
		
		for(int elem : arr)
			System.out.print(elem+" ");
	}
	
	public static int[] insertionSort(int[] arr) {
		
		for(int  i = 1; i<arr.length; i++) {
			int curr = arr[i];
			int j = i-1;
			while(j >= 0) {
				if(arr[j] > curr)
					arr[j+1] = arr[j];
				else
					break;
				j--;
			}
			arr[j+1] = curr;
		}
		
		return arr;
	}

}
