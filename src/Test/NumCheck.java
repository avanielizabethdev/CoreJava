package Test;

import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Num: ");
		
		int num = scanner.nextInt();
		if(num%2==0) {
			System.out.println("This is even");
		}else {
			System.out.println("This is Odd");
		}
		scanner.close();

	}

}
