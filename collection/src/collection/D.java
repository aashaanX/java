package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class D {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		Iterator itr1 = l1.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		l1.add(4);
		l1.add(5);
		l1.add(1);
		l1.add(2);
		Iterator itr2 = l2.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		System.out.println(l1.contains(l2));
		
		
	}

}
