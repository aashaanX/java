
public class F {
	public static void main(String[] args) {
		E e1 = new E();
		try{
			e1.test();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
