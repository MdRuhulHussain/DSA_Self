package dsa.basics;

public class SelectionSort {
	
	public static void main(String args[]) {
		int[] arr = {8,3,7,5,2,11,17};
		
		arr = selectionSort(arr);
		
		for(int elem : arr)
			System.out.print(elem+" ");
	}
	
	public static int[] selectionSort(int[] arr) {
		
		int temp = 0;
		for(int i=0; i<arr.length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}

}
