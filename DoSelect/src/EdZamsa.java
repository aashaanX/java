import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class EdZamsa {
	
	// function to find differences between all the elements in a list
	public TreeSet difference(TreeSet a){
		TreeSet b = new TreeSet();
		try{
			if (a.size()<Integer.parseInt(a.first().toString())){
				for(Object i : a){
					for(Object j : a){
						if(!(i.equals(j))){
							int x = Integer.parseInt(i.toString());
							int y = Integer.parseInt(j.toString());
							if ((x-y)>0){
								b.add(x-y);
							}
						}
					}
				}
				a.addAll(b);
				return difference(a);
			}else{
				return a;
			}
		}catch(StackOverflowError e){
			return a;
		}
	}
	
	// function to check whether the traversal is possible
	public Boolean check(int s,int d,int n,TreeSet a){
		for(Object i : a){
			if (((d-s)%Integer.parseInt(i.toString()))==0)
				return true;
			if ((s>d) &&((d+n-s)%Integer.parseInt(i.toString()))==0)
				return true;
			if ((s<d) &&((s+n-d)%Integer.parseInt(i.toString()))==0)
				return true;
		}
		return false;
	}
	
	// move function method(Use it loose it concept)
	// Brute forcing all possibilities
	public int move(int a,int b,int s,int d,int n,int count,TreeSet set){
		LinkedList done = new LinkedList();
		done.add(s);
		try{
			//System.out.println(count);
			System.out.print(s);
			System.out.print(" ");
			System.out.println(d);
			if (count<n){
				if(s==d){
					return count;
				}else{
					count++;
					int useap = move(a,b,(n+s+a)%n,d,n,count,set);
					int usebp = move(a,b,(n+s+b)%n,d,n,count,set);
					int useam = move(a,b,(n+s-a)%n,d,n,count,set);
					int usebm = move(a,b,(n+s-b)%n,d,n,count,set);
					return Integer.min(Integer.min(useap, usebp),Integer.min(useam,usebm));
				}
			}else{
				return 9999999;
			}
		}catch(StackOverflowError e){
			System.out.print("From catch:");
			System.out.print(s);
			System.out.print(" ");
			System.out.println(count);
			return count;
			}
		}
	
	public static void main(String[] args) {
		int count = 0;
		EdZamsa e = new EdZamsa();
		Scanner scan = new Scanner(System.in);
		String values = scan.nextLine();
		String[] V= values.split(" ");
		scan.close();
		int A = Integer.parseInt(V[0]);
		int B = Integer.parseInt(V[1]);
		int S = Integer.parseInt(V[2]);
		int D = Integer.parseInt(V[3]);
		int N = Integer.parseInt(V[4]);
		TreeSet set = new TreeSet(Collections.reverseOrder());
		set.add(A);
		set.add(B);
		TreeSet fin = e.difference(set);
		System.out.println(e.check(S,D,N,fin));
		System.out.println(e.move(A,B,S,D,N,0,set));
		
	}	

}
