package testingcampus;

import java.util.Scanner;

public class Anagram {
	public boolean check(String s1,String s2){
		// this method will check whether given two strings are anagram of each other
		if (s1.equals("")){
			return true;
		}else if(s1.length() != s2.length()){
			return false;
		}else if(s2.contains(s1.substring(0,1))){
			return check(s1.replaceFirst(s1.substring(0,1),""),s2.replaceFirst(s1.substring(0,1),""));
		}else{
			return false;
		}
	}
	public int difference(String s1,String s2){
		// returns the count of elements needed to be changed to make both strings an anagram.
		// both input string should be of the same size.
		if (s1.equals("")){
			return s2.length();
		}else if(s2.contains(s1.substring(0,1))){
			return difference(s1.replaceFirst(s1.substring(0,1),""),s2.replaceFirst(s1.substring(0,1),""));
		}else{
			return difference(s1.replaceFirst(s1.substring(0,1),""),s2);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		scan.close();
		Anagram a = new Anagram();
		//a.generate(s1);
		System.out.println(a.difference(s1,s2));
	}

}
