package whileLoop;

import java.util.Scanner;

public class sumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp=n;
		int sum = 0;
		
		while(temp>0) {
			int lastDigit = temp%10 ;
			sum += lastDigit;
			
			temp /= 10;
		}
System.out.println("the sum of digit "+ n + " 987654321is "+ sum);
	}

}
