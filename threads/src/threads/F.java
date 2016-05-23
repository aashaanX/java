package threads;
// object of E which contain over-rided run() is made here.
public class F {
	public static void main(String[] args) {
		E e1 = new E();
		e1.start();
		synchronized(e1){
			try {
				// pausing the main method
				//wait for e1.run() to notify
				e1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// after getting notify from thread-01 following statement will execute
	System.out.println(e1.balance);
	}

}
