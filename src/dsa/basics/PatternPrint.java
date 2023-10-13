package dsa.basics;

import java.util.Scanner;


/*
 * Printing the various patterns. The shape to print is shown in comment before
 * its business logic to print the pattern
 */
public class PatternPrint {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the size of the triangle, eg - 5");
		int n = sc.nextInt();
		
/* printing shape 
 		*****
 		****
 		***
 		**
 		*
*/

		for(int i = 1;i<=n;i++) {
			for(int j=n;j>=i;j--) 
				System.out.print("*");
			System.out.println();
		}

/*
 		*
 		**
 		***
 		****
 		*****
*/
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) 
				System.out.print("*");
			System.out.println();
		}
		
/*
 		A
		BB
		CCC
		DDDD
		EEEEE
 */
		char ch = 'A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(ch);
			ch++;
			System.out.println();
		}
	}

}
