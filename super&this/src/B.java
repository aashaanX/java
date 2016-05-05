
public class B {
	B(){
		System.out.println("No args");
	}
	B(int i){
		this();
	}
	public static void main(String[] args) {
		B a = new B(100);
	}
}


// example for 'this' in constructors.
// 'this' is the first statement in constructor.
