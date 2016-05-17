package testingcampus;

import java.util.Scanner;

public class Fibbonacci {
	public static void main(String[] args) {
		int a= 0;
		int b =1;
		int temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of terms:");
		int n = scan.nextInt();
		if(n==1){
			System.out.print(a);
		}
		else if(n==2){
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b);
		}
		else{
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b);
			System.out.print(" ");
			for(int i = 2;i<n;i++){
				temp = a+b;
				System.out.print(temp);
				System.out.print(" ");
				a = b;
				b = temp;
			}
		}
		scan.close();
	}
}
