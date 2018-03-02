package Intermediate_java;

import java.util.PriorityQueue;

public class java_queue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q=new PriorityQueue<String>();
		
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");
		q.offer("E");
		
		System.out.println(q);
		System.out.println();
		
		System.out.println(q.peek());
		System.out.println();
		
		q.poll();
		System.out.println(q);
		
	}

}
