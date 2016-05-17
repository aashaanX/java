
public class Bank {
	public static void main(String[] args) {
		int balance = 5000;
		int amount = 10000;
		
		if (balance<amount){
			try{
				throw new insufficientFunds();
			}catch(Exception e){
				System.out.println(e);
			}
		}else{
			System.out.println("Transaction Completed");
		}
	}

}
