# Postfix Calculator (Java)

A console-based postfix (Reverse Polish Notation) calculator written in Java. The program reads a postfix expression from the user, evaluates it using a stack, and prints the result. Enter `0` to exit.

## Features
- Evaluates postfix expressions using a `Stack<Integer>`
- Supports integer operands and the operators:
  - `+` (addition)
  - `-` (subtraction)
  - `*` (multiplication)
  - `/` (integer division)
  - `%` (modulo)
- Accepts input as **space-separated tokens**
- Repeats until the user enters `0`

## Example Input / Output
**Input**
 
  3 4 + 2 * = 14

**Output**

  The result of 3 4 + 2 * = 14

## How It Works
The calculator:
1. Splits the input string by whitespace.
2. Pushes integers onto a stack.
3. When an operator is found, it pops the right operand then the left operand, applies the operation, and pushes the result back onto the stack.
4. The final value left on the stack is the answer.

## Project Files
- `Postfix.java`  
  Contains `main()` and handles user input/output loop.
- `PostFixCalculator.java`  
  Contains the evaluation logic (`evaluatePostfix`) and integer checking.

> Note: Both classes are in the package `CSCI3200`, so keep them in a matching folder structure or adjust the package line if needed.

## Running in Eclipse
1. Import the project into Eclipse.
2. Ensure both files are located under `src/CSCI3200/`.
3. Run `Postfix.java` as a **Java Application**.
4. Type a postfix expression using spaces between tokens.

## Running from the Command Line
From the folder that contains the `CSCI3200` directory:

```bash
javac CSCI3200/PostFixCalculator.java CSCI3200/Postfix.java
java CSCI3200.Postfix
