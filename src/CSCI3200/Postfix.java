package CSCI3200;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		//variable repeats the main loop until false
		boolean repeat = true;
		
		//main loop
		while(repeat) {
			//initializes user input string
			System.out.print("Enter a postfix expression (or enter 0 to end): ");
			String postfix = user_input.nextLine();
			
			//close main loop if 0 is entered
			if(postfix.equals("0")) {
				System.out.println("Goodbye!");
				repeat = false;
			}
			
			//solves an prints user postfix expression
			else {
				PostFixCalculator my_calculator = new PostFixCalculator(postfix);
				
				//integer stack for this calculation
				Stack<Integer> stack = new Stack<>();
				
				//calculates the result of the expression
				int result = my_calculator.evaluatePostfix(stack);
				
				System.out.println("The result of " + postfix + " = " + result);
			}
		}
		
		user_input.close();

	}

}
