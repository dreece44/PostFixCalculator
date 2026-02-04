//--------------------------------------------------------------
//Group Members: Angie Garcia, Devin Reece
//Date: 10/27
//Course: Data Structures and Algorithm Analysis (CSCI 3200)
//Project Description: Project 1
//--------------------------------------------------------------



package CSCI3200;

import java.util.Stack;

public class PostFixCalculator {

	//constructor 1
	private String postfix;
	
	//constructor 2
	public PostFixCalculator(String input) {
		postfix = input;
	}
	
   //try case for integers
	public boolean isInteger(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
		
	//postfix calculation method
	public int evaluatePostfix(Stack<Integer> stack) {
		//cleans user input of spaces and declares it as an array for the loop
		String[] values = postfix.trim().split("\\s+");
		
		//loop for all values in postfix expression
		for (String token : values) {
            //puts only integers into the stack
			if (isInteger(token)) {
                stack.push(Integer.parseInt(token));
            }
            //finds what symbol has been entered
			else {
                //declares right and left number and total
				int right = stack.pop();
                int left = stack.pop();
                int total = 0;

                //finds symbol and calculates left and right to total
                switch (token) {
                    case "+":
                        total = left + right;
                        break;
                    case "-":
                        total = left - right;
                        break;
                    case "*":
                        total = left * right;
                        break;
                    case "/":
                        total = left / right;
                        break;
                    case "%":
                        total = left % right;
                        break;
                    //if unknown symbol is enter invalid operator
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
                //adds total to stack for next calculation
                stack.push(total);
            }
        }
        return stack.pop();  // FINAL ANSWER
    }

	
	
	

}
