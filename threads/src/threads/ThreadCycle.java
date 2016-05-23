package threads;

public class ThreadCycle extends Thread {
	public void run(){
		System.out.println("RUNNING");
	}
	
	public static void main(String[] args) {
		ThreadCycle th = new ThreadCycle();
		System.out.println(th.getState());
		th.start();
		System.out.println(th.getState());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(th.getState());
	}

}
