package methods;

public class greaterOfNums {

	public static void main(String[] args) {
		int firstNum = 20;
		int secondNum = 10;
int result = maxOf(firstNum, secondNum);
maxOf(100, 200);
maxOf(1, 0);
sayHi();
sayHi();
sayHi();
System.out.println(result);

		
	}
	
	// methods-
static int maxOf(int a, int b){
		if(a>b) {
		return a;
		}else {
			return b;
		}
	}

//method 2--
static void sayHi() {
	System.out.println("hi!!!");
}

}
