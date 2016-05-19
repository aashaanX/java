package threads;


public class C {
	public static void main(String[] args) {
		//Syntax for making Anonymous classes.
		//Anonymous classes helps in making multiple threads with different task.
		Thread th = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i<1000;i++){
					System.out.println("task 1");
				}
			}
		});
		th.start();
		for (int i = 0;i<1000;i++){
			System.out.println("task 2");
		}
	}

}
