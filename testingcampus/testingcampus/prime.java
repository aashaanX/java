package testingcampus;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		prime p = new prime();
		for(int i=0,j=1;i<n;j++){
			if(p.primeCheck(j)){
				System.out.println(j);
				i++;
			}
		}
		//System.out.println(p.primeCheck(n));
		scan.close();
	}
	public boolean primeCheck(int n){
		// this method will check whether given number is prime or not
		// will return a boolean value true if the number is prime else false
		for(int i = 2;i<=(n/2);i++){
			if ((n%i)== 0){
				return false;
			}
		}
		return true;
	}
}
