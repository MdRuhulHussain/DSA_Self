package dsa.basics;

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
