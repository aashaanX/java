package inheritance;
import java.util.Scanner;

public class AccountCreation extends PlatinumAccount{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1.Silver account,2.Gold account,3.Platinum account:");
		int choice = scan.nextInt();
		if (choice == 1){
			SilverAccount a = new SilverAccount();
			a.print();
		}
		if (choice == 2){
			GoldAccount a = new GoldAccount();
			a.print();
		}
		if (choice == 3){
			PlatinumAccount a = new PlatinumAccount();
			a.print();
		}
		scan.close();
	}

}
