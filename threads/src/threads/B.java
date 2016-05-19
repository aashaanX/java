package threads;

public class B implements Runnable {
	public void run(){
		for (int i=0;i<1000;i++){
			System.out.println("Task 1");
		}
	}
	public static void main(String[] args) {
		A a= new A();
		a.start();
		for (int i=0;i<1000;i++){
			System.out.println("Task 2");
		}
		//a.start();
	}

}
