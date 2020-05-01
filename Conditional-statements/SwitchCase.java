package conditional_statement;

public class SwitchCase {

	public static void main(String[] args) {
 int dayOfWeek = 1;
 
 switch(dayOfWeek) {
 case 1:
 case 2:
	 System.out.println("i am in office");
	 break;
 case 3:
	 System.out.println("i am playing football");
	 break;
	 
	 default:
		 System.out.println("i don't know what date it is...");
 }
	}

}
