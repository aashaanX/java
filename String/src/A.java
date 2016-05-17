
class A {
	public static void main(String[] args) {
		String s1 = "Test";
		String s2 = "Hello";
		System.out.println(s1.toUpperCase());
		s1 = s1.toUpperCase(); // s1 to upper case
		System.out.println(s1);
		s1 = s1.toLowerCase();// s1 to lower case
		System.out.println(s1);
		System.out.println(s1.length()); // prints length of s1
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s3.charAt(0));// To get values based on index
		//s3.charAt(1)= 'a'; // immutable
	}
}
