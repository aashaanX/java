package threads;
// program to show thread Synchronization issue while using threads
public class D {
	int balance = 0;
	public static void main(String[] args) {
		D d = new D();
		d.account();
		System.out.println(d.balance);
	}
	public void account(){
		// creating thread 1 using anonymous class
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				add();
			}
		});
		// creating thread 2 using anonymous class
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				sub();
			}
		});
		t1.start();
		t2.start();
		// join will connect multiple threads thread 2 will start from where thread 2 stalled.
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void add(){
		for(int i =0;i<1000;i++){
			balance = balance + i;
		}
	}
	public void sub(){
		for(int i = 0;i<1000;i++){
			balance = balance - i;
		}
	}

}


// out put values will be different all the time.
// which means the value of balance is corrupted due to unsynchronized use of threads.
