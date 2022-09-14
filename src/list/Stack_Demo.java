package list;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> animals = new Stack<>();
		
		animals.push("Lion"); //1st in
		animals.push("Elephent"); //2nd in
		animals.push("Dog"); //3rd in
		animals.push("Cat"); //4th in
		
		System.out.println(animals);
	
		System.out.println(animals.peek());
		
		animals.pop();
		System.out.println(animals);
		
		System.out.println(animals.peek());
		animals.pop();
		System.out.println(animals);

	}

}
