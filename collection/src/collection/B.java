package collection;

import java.util.ArrayList;
import java.util.Iterator;

// ArrayList implementation to explain remove by index,data
// also the implementation of homogeneous list
public class B {
	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		data.add(10);
		data.add("arjun");
		data.add("20");
		data.add(30);
		data.add(1,40);		//adding input based on index
		System.out.println(data.size());		// will show the size of list
		data.remove("20"); 						// remove by data
		data.remove(1);							//remove by index
		Iterator itr = data.iterator();			// implementing iterator
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> test = new ArrayList<Integer>();	// List test can contain only integers
		test.add(10);
		test.add(20);
		test.add(30);
		Iterator itr2 =test.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}
}
