package demo24;
import java.util.HashSet;


public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("name1");
		set.add("name2");
		set.add("name3");
		set.add("name4");
		set.add("name1");
		set.add(null);
		System.out.println(set);

	}

}
