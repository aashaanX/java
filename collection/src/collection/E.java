package collection;
// example program for set
import java.util.HashSet;
// set cannot hold duplicate values
// set can store heterogeneous values
// default raw is 16
// default load ratio is .75
public class E {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(20);
		set.add(30);
		set.add("xxx");
		set.add(10.5f);
		set.add(20);
		System.out.println(set);
		System.out.println(set.size());
	}

}
