package demo24;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList <String> ();
		list.add("dharshni");
		list.add("ashvini");
		list.add("Priya");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));		
					}
	   Iterator <String> itr = list.iterator();
	    
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String data:list) {
            System.out.println(data);
        }
		Collections.sort(list,Collections.reverseOrder());
		//Collections.reverse(list);
		System.out.println(list);
		
		LinkedList<String> list1 = new LinkedList <String>();
		list1.add("Note");
		list1.add("Note2");
		list1.add("Note3");
		list1.add("Note4");
		System.out.println(list1);
		
		Stack<String> list2 = new Stack<String>();
		list2.push("name1");
		list2.push("name2");
		list2.pop();
		list2.push("name3");
		list2.push("name4");
		list2.pop();
		System.out.println(list2);
		System.out.println(list2.peek());
		
		Vector<String> list3 = new Vector<String>();
		list3.add("book1");
		list3.add("book2");
		list3.add("book3");
		list3.add("book4");
		System.out.println(list3);
		
		

	}

}
