package inheritance;

public class PlatinumAccount extends GoldAccount {
	PlatinumAccount(){
		this.no_chqbook = 5;
		this.max_transaction = 100000;
		this.mobile_banking = 'y';
		this.net_banking = 'y';
		this.direct_banking = 'y';
	}

}
