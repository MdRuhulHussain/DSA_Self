package dsa.basics;

/*
 * Reverse the sentence keeping each words correctly but in reverse order
 */
public class ReverseSentence {
	
	public static void main(String args[]) {
		String sentence = "Reverse the string keeping the words correct but in the reverse order";
		System.out.println("printing the result from split method \n"+reverseSentenceUsingSplit(sentence));
		System.out.println("printing the result from manual approach method \n"+reverseSentence(sentence));
	}
	//using split method
	public static String reverseSentenceUsingSplit(String sentence) {
		String result = "";
		String[] words = sentence.split(" ");
		for(int i=words.length-1;i>0;i--)
			result += words[i]+" ";
		result += words[0];
		
		return result;
	}
	
	//reverse by identifying space
	public static String reverseSentence(String sentence) {
		String result = "";
		int j = sentence.length();
		for(int i=sentence.length()-1; i>=0;i--) {
			if(sentence.charAt(i) == ' ') {
				for(int temp = i+1; temp < j; temp++)
					result += sentence.charAt(temp);
				result += " ";
				j = i;
			}
				
		}
		for(int i =0;i<j;i++)
			result += sentence.charAt(i);
		return result;
	}

}
