// Usage of Values() and ordinal().
public class E {
	enum Test{
		t1,t2,t3,t4;
	}
	public static void main(String[] args) {
		// values() will return all the values in the corresponding enum
		Test[] a = Test.values();
		System.out.println(a[1]);
		// ordinal() will return the ordinal status of the element in the enum.
		System.out.println(Test.t3.ordinal());
	}


}
