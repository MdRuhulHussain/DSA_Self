package dsa.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParenthesis {
	
	//Write a program to check if the string is a set of valid parenthesis '(', ')',
	//'{', '}', '[', ']'. The brackets needs to be in order.
	//for example str = "([{}])" is a valid but str = "([){]}" is not valid
	public static void main(String args[]) {
	
		String s1 = "([{}])";
		String s2 = "([{}]))";
		System.out.println("The string "+s1+" is valid "+checkValid(s1));
		System.out.println("The string "+s2+" is valid "+checkValid(s2));
	}
	
	public static boolean checkValid(String str) {
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch))
				stack.push(ch);
			else if(map.values().contains(ch)) {
				if(!stack.isEmpty() && map.get(stack.peek()) == ch)
					stack.pop();
				else
					return false;
			} else
				return false;
		}
		
		return stack.empty();
	}

}
