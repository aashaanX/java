package methodes;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		factorial f = new factorial();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		int ans = f.fact(num);
		System.out.println(ans);
		scan.close();		
	}
	public int fact(int n){
		if (n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}

}
