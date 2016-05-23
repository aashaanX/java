package threads;
// inherited Thread class
public class E extends Thread{
	int balance = 0;
	public void run(){
		for (int i=0;i<1000;i++){
			this.balance++;
		}
		try{
			notify();
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
