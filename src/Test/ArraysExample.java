package Test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {20,30,40,50};
		
		System.out.println("Total number of values: " + num1.length);
		System.out.println("value at 3rd position: "+num1[2]);
		System.out.println("value at last position: "+ num1[num1.length -1]);
		
		String[] name1 = {"abc","xyz","pqr"};
		
		System.out.println("value at 3rd position: "+ name1[2]);
		
		String name= "Clean India Green India Love India";
		
		String[] arrWords = name.split("");
		System.out.println("value at 3rd position: "+ arrWords[2]);
		System.out.println("Total num of words: " + arrWords.length);

	}

}
