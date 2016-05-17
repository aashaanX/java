
public class ReverseRecursion {
	public String reverse(String s1,String temp){ 
		// temp should be given as <""> in function call
		if(s1.length()==0){
			return temp;
		}else{
			temp = s1.substring(0,1).concat(temp);
			return this.reverse(s1.substring(1,s1.length()), temp);
			}
	}
	public static void main(String[] args) {
		ReverseRecursion a =new ReverseRecursion();
		String ans= a.reverse("malayalam", "");// second argument is given as empty string
		System.out.println(ans);
	}

}
