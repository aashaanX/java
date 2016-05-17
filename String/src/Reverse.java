import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		// this program will take a string as input from user
		// and will print the string in reverse order
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		System.out.println(s1.substring(0, 1));
		scan.close();
		for(int i = s1.length()-1;i>=0;i--){
			System.out.print(s1.charAt(i));
		}
	}

}
