package conditional_statement;

public class NestedIfElse {

	public static void main(String[] args) {
		// Largest of three no.s
		int a = 12, b= 10, c=100;
		int result = 0;
		
		if(a>b) {
			if(a>c) {
				result = a;
			}else {
				result = c;
			}
		}else {
			if(b>c) {
				result = b;
			}else {
				result = c;
			}
		}
		System.out.println("Largest of three no. is: " + result);
	}

}
