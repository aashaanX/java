import java.util.Scanner;

public class bank implements transaction,settings{
	Scanner scan = new Scanner(System.in);
	bank(){
		System.out.println("Enter name:");
		this.name = scan.next();
		System.out.println("enter account number:");
		this.account_number = scan.nextInt();
		System.out.println("ener the initial amount : ");
		this.balance = scan.nextInt();
		System.out.println("enter the mobile number");
		this.mob_number = scan.next();
		System.out.println("enter the password for user :");
		this.passw = scan.next();
		
	}
	String name;
	int balance;
	int account_number;
	String mob_number;
	String passw;
	int transaction_id = 1000;
	public void balance(){
		System.out.print("balance = ");
		System.out.println(this.balance);
	}
	public void transfer(){
		System.out.println("transfer amount = ");
		int a = scan.nextInt();
		this.balance = this.balance - a;
		System.out.println("transfered Successfully");
		System.out.print("current balance = ");
		System.out.println(this.balance);
		System.out.print("transaction id : ");
		this.transaction_id = this.transaction_id++;
		System.out.print(this.transaction_id);
	}
	public void statement(){
		System.out.println("statment");
		System.out.print("name:");
		System.out.println(this.name);
		System.out.print("account number:");
		System.out.println(this.account_number);
		System.out.print("mobile number : ");
		System.out.println(this.mob_number);
	}
	public void billPayment(){
		System.out.println("bill_payment");
		System.out.print("amount = ");
		int a = scan.nextInt();
		this.balance = this.balance - a;
		System.out.print("current balance = ");
		System.out.println(this.balance);
	}
	public void changepwd(){
		System.out.println("change Password");
		System.out.print("enter new password : ");
		this.passw = scan.next();		
	}
	public void userDetails(){
		System.out.println("User Details");
		System.out.print("name:");
		System.out.println(this.name);
		System.out.print("account number:");
		System.out.println(this.account_number);
		System.out.print("mobile number : ");
		System.out.println(this.mob_number);
		System.out.print("balance : ");
		System.out.println(this.balance);
		
	}
	public static void main(String[] args) {
		bank b =new bank();
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("enter 1.balance 2.transfer 3.statement 4.billpaymeny 5.change password 6.user Details");
			int value = s.nextInt();
			if (value>6){
				break;
			}
			switch(value){
				case 1:{
					b.balance();
					break;
				}
				case 2:{
					b.transfer();
					break;
				}
				case 3:{
					b.statement();
					break;
				}
				case 4:{
					b.billPayment();
					break;
				}
				case 5:{
					b.changepwd();
					break;
				}
				case 6:{
					b.userDetails();
					break;
				}
			}
			
		}
		s.close();
	}
}
	
