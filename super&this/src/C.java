
public class C {
	public static void main(String[] args) {
		C c = new C();
		c.test1();
	}
	public void test1(){
		this.test2();
	}
	public static void test2(){
		System.out.println("from test2");
	}

}


// accessing static method using 'this'