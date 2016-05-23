import java.util.Scanner;
// no blank space stripping is done here
public class Words2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		char arr[]= str.toCharArray();
		int count = 0;
		for (int i=0;i<arr.length;i++){
			if (arr[i] == ' '){
					count++;
			}
		}
		System.out.println(count+1);
	}

}
