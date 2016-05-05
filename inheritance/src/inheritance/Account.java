package inheritance;

public class Account {
	int max_transaction = 0;
	char mobile_banking = 'n';
	char net_banking = 'n';
	int no_chqbook = 0;
	char direct_banking = 'n';
	public void print(){
		System.out.println(no_chqbook);
		System.out.println(max_transaction);
		System.out.println(mobile_banking);
		System.out.println(net_banking);
		System.out.println(direct_banking);
	}
}
