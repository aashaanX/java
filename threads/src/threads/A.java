package threads;

public class A extends Thread {
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("Thread 1");
		}
	}
	public static void main(String[] args) {
		A a = new A();
		// threads run alternatively if below statement is uncommented
		a.start();
		for(int i = 0;i<1000;i++){
			System.out.println("Thread 2");
		}
		// threads run in sequence if below statement is uncommented
		//a.start();
	}

}
