package collection;

import java.util.HashSet;
import java.util.Iterator;

// example program for HashSet
// overloading size and load ratio
// the output of set will not be sorted or will or will not contain the data in order of input.
public class F {
	public static void main(String[] args) {
		HashSet set = new HashSet(10,.80f);
		set.add(10);
		set.add(30);
		set.add(70);
		set.add(55);
		set.add(100);
		set.add(31);
		set.add(11);
		set.add(32);
		set.add(73);
		set.add(54);
		set.add(105);
		set.add(36);
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
