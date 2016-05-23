import java.util.Scanner;

public class Palindrome extends ReverseRecursion {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		Palindrome str = new Palindrome();
		if(s.equals(str.reverse(s, ""))){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not Palindrome");
		}
	}

}
