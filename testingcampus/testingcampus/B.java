// inheritance child class

package testingcampus;

public class B extends A{
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.i); // inherited
		System.out.println(b.j); // inherited
		b.test(); // inherited
		System.out.println(B.x); // Converted not inherited
	}
}

// static members are stored in common memory and not inherited to objects of child class
// non static members are inherited to the object