import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("enter the pin:");
			int pin = scan.nextInt();
			if (pin == 1234){
				System.out.println("WELCOME");
				break;
			}
			else{
				System.out.println("Invalid Pin");
			}
			if (i==2){
				System.out.println("Card is Blocked");
			}
		}
		scan.close();
	}

}
