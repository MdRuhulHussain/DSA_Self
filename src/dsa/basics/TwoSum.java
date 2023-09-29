package dsa.basics;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	//program returning the positions of two numbers summing to the given target from the given array 
	public static void main(String args[]) {
		
		int[] numbers = {4,9,8,3,7,5};
		int target = 10;
		twoSumNaiveApproach(numbers, target);
		
		twoSumOptimizedApproach(numbers, target);
	}
	
	public static void twoSumNaiveApproach(int[] numbers, int target) {
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i] + numbers[j] == target)
					System.out.println("positions are "+i+" and "+j);
				break;
			}
		}
	}
	
	public static void twoSumOptimizedApproach(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<numbers.length;i++) {
			if(map.containsKey(numbers[i])) {
				int pos = map.get(numbers[i]);
				System.out.println("positions are "+pos+" and "+i);
				break;
			}
			map.put(target - numbers[i], i);
		}
	}
	
	
}
