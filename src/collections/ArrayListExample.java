package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ArrayList<String> arraylist1 = new ArrayList<String>();
		
		//store the data
		arraylist1.add("Avani"); //0 index
		arraylist1.add("Priya"); //1 index
		arraylist1.add("Raj"); //2 index
		arraylist1.add("Mohan"); //3 index
		
		System.out.println("The size of arraylist is: "+arraylist1.size());
		System.out.println(arraylist1);
		
		//To print single element
		System.out.println("The element at 2 index is: "+arraylist1.get(2));
		
		//To remove the arrayList
		arraylist1.remove(0);
		
		System.out.println("The size of arraylist is: " +arraylist1.size());
		System.out.println(arraylist1);
		
		arraylist1.set(1, "mebin");  //to replace the value at 1st position
		
		//1.easy way to iterate 
		for(int index=0;index<arraylist1.size();index++) {
			
			System.out.println(arraylist1.get(index));
		}
		
		//2nd way
		for(String name: arraylist1) {
			
			System.out.println(name);
		}
		
		Iterator<String> itr = arraylist1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//To sort the array
		
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		//Sort the array into decenting order

	}

}
