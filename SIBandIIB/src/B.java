
public class B extends A {
	public static void main(String[] args) {
		B b = new B();
	}
}
// the Static of parent class will run
// the IIb of parent class will run when object is created
// constructor of the parent class will also run --> reason
		// when child class object is created, object will contain constructor which 
			//Automatically contains a super keyword