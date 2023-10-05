package dsa.basics;

public class QuickSort {
	
	public static void main(String args[]) {
		
		int[] arr = {23, 14, 90, 65, 34, 87, 55, 46, 104};
		
		quickSort(arr, 0, arr.length-1);
		
		for(int num : arr)
			System.out.print(num+" ");
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if( start >= end)
			return;
		int pivotIndex = partition(arr, start, end);
		
		quickSort(arr, start, pivotIndex-1);
		
		quickSort(arr, pivotIndex+1, end);
	}
	
	public static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[start];
		
		int count = 0;
		for(int i= start+1; i<=end;i++) {
			if(arr[i]<=pivot)
				count++;
		}
		
		int pivotIndex = start + count;
		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[start];
		arr[start] = temp;
		
		int i = start, j = end;
		while(i < pivotIndex && j > pivotIndex) {
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			
			if(i < pivotIndex && j > pivotIndex) {
				temp = arr[i];
				arr[i++] = arr[j];
				arr[j--] = temp;
//				i++;
//				j--;
			}
			
		}
		return pivotIndex;
	}
	
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}

}
