package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//priority queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Nik");
		pq1.add("Mathew");
		pq1.add("Lisa");
		
		System.out.println(pq1);
		
		System.out.println("First Element: " + pq1.peek());
		
		System.out.println("First Element: " + pq1.poll());  //remove the first element
		
		System.out.println(pq1);
		
		//arraydq
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Nik");
		dq1.add("Mathew");
		dq1.add("Lisa");
		
		System.out.println(dq1);
		
		System.out.println(dq1.peek());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		System.out.println(dq1.poll());
		//System.out.println(dq1.pollFirst());
		//System.out.println(dq1.pollLast());
		System.out.println(dq1);
		
		
		

	}

}
