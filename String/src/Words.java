import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		System.out.println(s.split(" ").length);
	}

}
