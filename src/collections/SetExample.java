package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("name1");
		set1.add("name2");
		set1.add("name3");
		set1.add("name4");
		set1.add("name5");
		
		System.out.println(set1);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		
		set2.add("mebin");
		set2.add("avani");
		set2.add("ambari");
		
		System.out.println(set2);
		
TreeSet<String> set3 = new TreeSet<String>();
		
		set3.add("jerin");
		set3.add("nancy");
		set3.add("pulari");
		
		System.out.println(set3);
		
		//Home Work: remove duplicate
		String str1 = "Clean World Green World";
		
		 HashSet<String> hs1 = new HashSet<String>();
		 
	        for (String word : str1.split(" ")) {
	        	
	            hs1.add(word);
	        }
	        
	        System.out.println(hs1);
	    }
	
		

	}

