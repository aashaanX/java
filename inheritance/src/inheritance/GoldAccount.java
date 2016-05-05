package inheritance;

public class GoldAccount extends SilverAccount {
	GoldAccount(){
		this.no_chqbook = 2;
		this.max_transaction = 60000;
		this.mobile_banking = 'y';
		this.net_banking = 'y';
	}

}
