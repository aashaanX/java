package testingcampus;

import java.util.Scanner;

public class NonRepetetiveLetter {
	public char nonRep(String s){
		// method to find non repetitive character in the string
		if (s.length()==0){
			System.out.println("no non repetative string");
			return 0;
		}	
		else if(!(s.substring(1).contains(s.substring(0,1)))){
			return s.substring(0,1).charAt(0);
		}
		else{
			s = s.replaceAll(s.substring(0,1), "");
			return nonRep(s);
		}
		
	}
	public static void main(String[] args) {
		NonRepetetiveLetter n = new NonRepetetiveLetter();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(n.nonRep(s));
		scan.close();
	}

}
