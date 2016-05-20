import java.util.Scanner;
// Reversing String with Swapping method.
public class Revesrse2 {
	public static void main(String[] args) {
		int i=0;
		System.out.println("Enter the String:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char sub[] = str.toCharArray();
		for (int j = sub.length-1;i<j;j--,i++){
			char temp = sub[j];
			sub[j] = sub[i];
			sub[i] = temp;
		}
		for (char c:sub){
			System.out.print(c);
		}
		scan.close();
	}

}
