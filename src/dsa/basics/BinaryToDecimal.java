package dsa.basics;

public class BinaryToDecimal {
	
	
	public static void main(String args[]) {
		System.out.println(binaryToDecimal(110011));
		
		System.out.println(binaryToDecimal(110011));
	}
	
	//when given number is of integer type
	public static int binaryToDecimal(int n) {
		int dec = 0;
		int power = 0;
		while(n>0) {
			if(n%10 == 1)
				dec += 1 << power; // 1 with left shift power will give 2^power, which is faster than actual power method
			power++;
			n/=10;
		}
		return dec;		
	}
	
	//when given number is of string type, mostly the binary numbers will be of 32
	//bits as string
	public static int binaryToDecimal(String n) {
		int dec = 0;
		int power = 0;
		for(int i = n.length()-1; i>=0; i--) {
			if(n.charAt(i) == '1')
				dec += 1 << power;
			power++;
		}
		return dec;
	}

}
