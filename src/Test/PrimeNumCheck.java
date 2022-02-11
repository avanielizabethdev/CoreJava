package Test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 13;
		boolean flag = true;
		
		for(int index=2;index<num;index++) {
			int temp = num%index;
			if(temp==0) {
				flag = false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("the number is prime");
		}else {
			System.out.println("the number is not prime");
		}

	}

}
