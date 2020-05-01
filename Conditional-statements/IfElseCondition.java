package conditional_statement;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ternary operator : variable = (condition) ? expressionTrue : expressionFalse;
		// "?" checks condition
		// ":" = else.
		 
		int a = 15;
		int b = 8;
		
		int maxOfBothNumbers = 0;
		 
		maxOfBothNumbers = a>b ? a : b;
		System.out.println("max of both no. is " + maxOfBothNumbers );
	}

}
