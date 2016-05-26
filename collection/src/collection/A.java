package collection;

import java.util.ArrayList;
import java.util.Iterator;
// implementation of ArrayList
public class A {
	public static void main(String[] args) {
		ArrayList data = new ArrayList();	// creating array list
		data.add(10);		// adding intiger data
		data.add("arjun");	// adding String
		data.add(10.2f);	// adding float
		System.out.println(data); // printing the data.
		
		// Traversing using iterator.
		Iterator itr = data.iterator(); //declaring an iterator pointing to ArrayList 'data'
		while(itr.hasNext()){			// hasnext() will return true if there is a next element
			System.out.println(itr.next()); //next() will move the control to next element.
		}
	}

}
