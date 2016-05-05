
public class A {
	int i = 10;
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.i);
		a1.test();
	}
	public void test(){
		System.out.println(this.i);
	}

}

// 'this' points to the current object
// 'this' cannot be used in the static methods hence not possible in main method
// using 'this' we can call constructors of some class, then it should be used inside another constructor
// 'this' should always be the first statement inside another constructor.
// Using 'this' we can access both static and non-static members
// using 'this' we can never access the local variable