import java.util.Scanner;

public class BigWord {
	public static void main(String[] args) {
		String s1;
		Scanner scan = new Scanner(System.in);
		s1 = scan.nextLine();
		String arr[] = s1.split(" ");
		String big = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i].length()>big.length()){
				big = arr[i];
			}
		}
		System.out.println(big);
		scan.close();
	}
}
