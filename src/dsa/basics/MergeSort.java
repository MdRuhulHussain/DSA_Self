package dsa.basics;

public class MergeSort {
	
	public static void merge(int[] arr, int s, int e) {
		
		int mid = (s+e)/2;
		int len1 = mid-s+1;
		int len2 = e-mid;
		
		int[] first = new int[len1];
		int[] second = new int[len2];
		
		int mainArrayIndex = s;
		for(int i=0;i<len1;i++)
			first[i] = arr[mainArrayIndex++];
		
		mainArrayIndex = mid+1;
		for(int i=0;i<len2;i++)
			second[i] = arr[mainArrayIndex++];
		
		int index1 = 0;
		int index2 = 0;
		mainArrayIndex = s;
		
		while(index1 < len1 && index2 < len2) {
			if(first[index1] < second[index2])
				arr[mainArrayIndex++] = first[index1++];
			else
				arr[mainArrayIndex++] = second[index2++];
		}
		
		while(index1 < len1)
			arr[mainArrayIndex++] = first[index1++];
		
		while(index2 < len2)
			arr[mainArrayIndex++] = second[index2++];
		
		
		
		
	}
	public static void main(String args[]) {
//		int[] arr = {17,8,14,19,12,6,1,8,12,9,25};
		
		int[] arr = {38,27,43,10};
		
		mergeSortRecursion(arr, 0, arr.length-1);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void mergeSortRecursion(int[] arr, int start, int end) {
		
		System.out.println("Hi");
		if(start>=end)
			return;
		int mid = (start+end)/2;
		
		
		mergeSortRecursion(arr, start, mid);
		System.out.println("Hi");
		mergeSortRecursion(arr, mid+1, end);
		
		merge(arr, start, end);
	}
	
	

}
