package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		//To add the data use put operation
		
		map1.put(1, "avani");
		map1.put(2, "mebin");
		map1.put(3, "ambari");
		
		System.out.println(map1);
		
		//Update the data in map
		map1.put(3, "Joly");
		
		System.out.println(map1);
		
		//delete the entry
		map1.remove(3);
		System.out.println(map1);
		
		//how to iterate through the map
		
		//create entry set of value
		System.out.println(map1.get(3));
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet()) {
			
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}
		
		//print only the keys
		
		for(Integer val:map1.keySet()) {
			
			System.out.println("key is: "+ val);
			
			//you can print values along with keys
			System.out.println("Value is: "+ map1.get(val));
		}
		
		//print only value set
		
		for(String val : map1.values()) {
			System.out.println("Value is: " + val);
		}
		/*
		//============================================================
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		
		map2.put(1, "avani");
		map2.put(2, "mebin");
		map2.put(3, "ambari");
		
		System.out.println(map2);
		
		//============================================================
		
TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(1, "avani");
		map3.put(3, "mebin");
		map3.put(2, "ambari");
		
		System.out.println(map3);
*/
		
		// HW: Count the occurance of every words
		
		String str1 = "Clean India Green India Love India";
		
		// Declaring a HashMap of <String, Integer>
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		
		// Splitting the words of string
        // and storing them in the array.
		String[] words = str1.split(" ");
		
		for(String word : words) {
			
			// Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = hashmap.get(word);
 
            if (integer == null)
                // Storing the word as key and its
                // occurrence as value in the HashMap.
            	hashmap.put(word, 1);
            
            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
            	hashmap.put(word, integer + 1);
            }
		}
		
		System.out.println(hashmap);
	}

}
