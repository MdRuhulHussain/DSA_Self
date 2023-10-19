package dsa.basics;

import java.util.Scanner;

public class HourGlassSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		int[][] arr = new int[6][6];
		
		
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<6;j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
		
		//Uncomment above code to take inputs from user, otherwise use below inputs
		int[][] arr = 
			 {{-9,-9,-9,1,1,1}
			 ,{0,-9,0,4,3,2}
			 ,{-9,-9,-9,1,2,3}
			 ,{0,0,8,6,6,0}
			 ,{0,0,0,-2,0,0}
			 ,{0,0,1,2,4,0}};
			

		
		/* Inputs will be in below form
		 * -9 -9 -9  1 1 1 
 			0 -9  0  4 3 2
			-9 -9 -9  1 2 3
 			0  0  8  6 6 0
 			0  0  0 -2 0 0
 			0  0  1  2 4 0
		 * 
		 */
		
		System.out.println("max sum of the numbers of hour glasses = "+hourGlassSum(arr));

	}
	
	public static int hourGlassSum(int[][] arr) {
		int hoursum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                hoursum = 0;
                for(int k=i;k<i+3;k++){
                   for(int l=j;l<j+3;l++) {
                       if(k==i+1 && (l==j || l==j+2))
                        continue;
                       hoursum += arr[k][l];
                   }
                }
                
                if(hoursum>max)
                    max = hoursum;
            }
        }
		
		return max;
	}

}
