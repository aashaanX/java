import java.util.Scanner;

public class name {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		if (name.equals("arjun")){
			System.out.println("Welcome");
		}
		else{
			System.out.println("Not a Member");
		}
		scan.close();
	}

}
