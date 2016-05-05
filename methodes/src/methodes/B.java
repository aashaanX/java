package methodes;

public class B {
	static int i = 10;
	public static void main(String[] args) {
		System.out.println(i); // accessing static member
		B b = new B();
		System.out.println(b.i); // accessing static member
	}

}
