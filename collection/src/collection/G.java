package collection;
// Tree set will be sorted automatically.
// The underlying data structure is a Tree
// Sorting is possible in same set of data.


import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class G {
	public static void main(String[] args) {
		// Collections.reverseOreder is used to Store data in reverse order
		TreeSet set = new TreeSet(Collections.reverseOrder());
		set.add(10);
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(6);
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
