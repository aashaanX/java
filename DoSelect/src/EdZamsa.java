import java.util.Scanner;

public class EdZamsa {
	// move function method(Use it loose it concept)
	public int move(int a,int b,int s,int d,int n,int count){
		System.out.print(s);
		System.out.print(" ");
		System.out.println(d);
		if(s==d){
			return count;
		}else if(s<d){
			count++;
			int usea = move(a,b,s+a,d,n,count);
			int useb = move(a,b,s+b,d,n,count);
			return Integer.min(usea, useb);
		}else{
			count++;
			int usea = move(a,b,s-a,d,n,count);
			int useb = move(a,b,s-a,d,n,count);
			return Integer.min(usea, useb);
		}
	}
	
	
	
	public int bw(int a,int b,int s,int d,int n,int count){
		System.out.print(s);
		System.out.print(" ");
		System.out.println(d);
		if(s==d){
			return count;
		}else if((s>d) && (s-Integer.max(a, b)>= d)) {
			s = s-Integer.max(a, b);
			count++;
			return bw(a,b,s,d,n,count);
		}else if((s>d) && (s-Integer.min(a, b)>= d)){
			s = s-Integer.min(a, b);
			count++;
			return bw(a,b,s,d,n,count);
		}else if ((s>d) && (s-Integer.min(a, b)<= d)){
			s = s-Integer.min(a, b);
			count++;
			return fw(a,b,s,d,n,count);
		}else if ((s>d) && (s-Integer.max(a, b)<= d)){
			s = s-Integer.max(a, b);
			count++;
			return fw(a,b,s,d,n,count);
		}else{
			return -1;
		}
	}
	
	public int fw(int a,int b,int s,int d,int n,int count){
		System.out.print(s);
		System.out.print(" ");
		System.out.println(d);
		if(s==d){
			return count;
		}else if((s<d) && (s+Integer.max(a, b)<= d)) {
			s = s+Integer.max(a, b);
			count++;
			return fw(a,b,s,d,n,count);
		}else if((s<d) && (s+Integer.min(a, b)<= d)){
			s = s+Integer.min(a, b);
			count++;
			return fw(a,b,s,d,n,count);
		}else if ((s<d) && (s+Integer.max(a, b)>= d)){
			s = s+Integer.max(a, b);
			count++;
			return bw(a,b,s,d,n,count);
		}else if ((s<d) && (s+Integer.min(a, b)>= d)){
			s = s+Integer.min(a, b);
			count++;
			return bw(a,b,s,d,n,count);
		}else{
			return -1;
		}
	}
	public static void main(String[] args) {
		int count = 0;
		EdZamsa e = new EdZamsa();
		Scanner scan = new Scanner(System.in);
		String values = scan.nextLine();
		String[] V= values.split(" ");
		int A = Integer.parseInt(V[0]);
		int B = Integer.parseInt(V[1]);
		int S = Integer.parseInt(V[2]);
		int D = Integer.parseInt(V[3]);
		int N = Integer.parseInt(V[4]);
		if(Math.abs(S-D)>(int)(N/2)){
			if((S-D)< 0){
				count = e.bw(A,B,S,D,N,0); 
			}else{
				count = e.fw(A,B,S,D,N,0);
			}
		}else{
			if((S-D)<0){
				count = e.fw(A,B,S,D,N,0);
			}else{
				count = e.bw(A,B,S,D,N,0);
			}
		}
		System.out.println(count);
		System.out.println(e.move(2,3,1,5,6,0));
	}	

}
