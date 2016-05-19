
public class A {
	
	static int i;
	static int k;
	int a;
	int b;
	A(){
		System.out.println("From Constructor");
	}
	static{
		System.out.println("From Static");
		i = 10;
		k = 20;
		System.out.println(i);
		System.out.println(k);
	}
	{
		System.out.println("From IIB");
		a=30;
		b=40;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println("From Main");
		A a = new A();
	}

}
