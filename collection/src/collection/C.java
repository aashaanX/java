package collection;
// implementing Linked list.
// in java for Linked List underlying data structure is doubly Linked list. 
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class C {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();	// creating a linked list
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(1, 4);
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		Collections.sort(l1);
		System.out.println(l1.size()); // prints the size of liked list
		System.out.println(Collections.binarySearch(l1, 3)); // search works only if list is sorted
		System.out.println(l1);
	}
}


// Doubt:
// implementing doubly linked list how??
