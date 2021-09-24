package demo24;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.ArrayDeque;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> list3 = new PriorityQueue<String>();
		list3.add("book1");
		list3.add("book2");
		list3.add("book3");
		list3.add("book4");
		
		System.out.println(list3.peek());
		String first =list3.poll();
		System.out.println(first);
		System.out.println(list3);
		
		ArrayDeque<String> list1 = new ArrayDeque<String>();
		list1.add("Note1");
		list1.add("Note2");
		list1.addFirst("Note3");
		list1.addLast("Note4");
		System.out.println(list1);

	}

}
