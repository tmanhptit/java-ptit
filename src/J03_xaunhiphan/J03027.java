package J03_xaunhiphan;

import java.util.Scanner;
import java.util.Stack;

public class J03027 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	Stack<Character> stack=new Stack();
	for(int i=0;i<s.length();i++) {
		if(stack.isEmpty()) stack.add(s.charAt(i));
		else {
			if(stack.peek()==s.charAt(i))stack.pop();
			else stack.add(s.charAt(i));
		}
	}
	//System.out.println(stack.size());
	if(stack.isEmpty())System.out.println("Empty String");
	for (Character character : stack) {
		System.out.print(character);
	}
}
}
