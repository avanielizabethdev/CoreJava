package Test;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop to print 1 to 10
		
		int num1 = 1;
		
		while(num1<=10) {
			
			if(num1==5) {
				num1 = num1+1;
				continue;
			}
			
			System.out.println(num1);
			num1=num1+1;
			
			//For loop to print 1 to 10
			
			for(int count=1;count<=10;count++) {
				if(num1==5){
					continue;
				}
				System.out.println("inside for loop" + count);
			}
		
		}
		
		//arrays with loop
		
		int[] array1 = {20,30,40,50};
		for(int index=0;index<array1.length;index++) {
			System.out.println("value inside array" + array1[index]);
		}
		for(int var1:array1) {
			System.out.println(var1);
		}

	}

}
