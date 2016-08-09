package awpl;

import java.util.Scanner;

public class FindCrossWord {
	
	public static int count(String[][] mat,String key,int n){
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mat[i][j].equals(key.substring(0, 1))){
					int flag=0;
					//System.out.println("here");
					for(int k=0;k<key.length();k++){
						try{
							if(!(mat[i+k][j].equals(key.substring(k,k+1)))){
								flag=1;
								break;
							}
						}catch(Exception e){
							flag=1;
						}
					}
					if(flag==0){
						count++;
					}
				}
				if(mat[i][j].equals(key.substring(0, 1))){
					int flag=0;
					//System.out.println("here");
					for(int k=0;k<key.length();k++){
						try{
							if(!(mat[i+k][j+k].equals(key.substring(k,k+1)))){
								flag=1;
								break;
							}
						}catch(Exception e){
							flag=1;
						}
					}
					if(flag==0){
						count++;
					}
				}
				if(mat[i][j].equals(key.substring(0, 1))){
					int flag=0;
					//System.out.println("here");
					for(int k=0;k<key.length();k++){
						try{
							if(!(mat[i][j+k].equals(key.substring(k,k+1)))){
								flag=1;
								break;
							}
						}catch(Exception e){
							flag=1;
						}
					}
					if(flag==0){
						count++;
					}
				}
				if(mat[i][j].equals(key.substring(0, 1))){
					int flag=0;
					//System.out.println("here");
					for(int k=0;k<key.length();k++){
						try{
							if(!(mat[i-k][j].equals(key.substring(k,k+1)))){
								flag=1;
								break;
							}
						}catch(Exception e){
							flag=1;
						}
					}
					if(flag==0){
						count++;
					}
				}
				if(mat[i][j].equals(key.substring(0, 1))){
					int flag=0;
					//System.out.println("here");
					for(int k=0;k<key.length();k++){
						try{
							if(!(mat[i+k][j-k].equals(key.substring(k,k+1)))){
								flag=1;
								break;
							}
						}catch(Exception e){
							flag=1;
						}
					}
					if(flag==0){
						count++;
					}
				}
				if(mat[i][j].equals(key.substring(0, 1))){
					int flag=0;
					//System.out.println("here");
					for(int k=0;k<key.length();k++){
						try{
							if(!(mat[i][j-k].equals(key.substring(k,k+1)))){
								flag=1;
								break;
							}
						}catch(Exception e){
							flag=1;
						}
					}
					if(flag==0){
						count++;
					}
				}
				if(mat[i][j].equals(key.substring(0, 1))){
					int flag=0;
					//System.out.println("here");
					for(int k=0;k<key.length();k++){
						try{
							if(!(mat[i+k][j-k].equals(key.substring(k,k+1)))){
								flag=1;
								break;
							}
						}catch(Exception e){
							flag=1;
						}
					}
					if(flag==0){
						count++;
					}
				}
				if(mat[i][j].equals(key.substring(0, 1))){
					int flag=0;
					//System.out.println("here");
					for(int k=0;k<key.length();k++){
						try{
							if(!(mat[i-k][j+k].equals(key.substring(k,k+1)))){
								flag=1;
								break;
							}
						}catch(Exception e){
							flag=1;
						}
					}
					if(flag==0){
						count++;
					}
				}
			}
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		String key = scan.next();
		//System.out.println(str);
		String[][] mat = new String[n][n];
		String str1 = str.substring(1, str.length()-1);
		//System.out.println(str1);
		String[] str2 = str1.split(",");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j] = str2[i].split("#")[j];
				//System.out.print(str2[i].split("#")[j]);
			}
			//System.out.println();
		}
		//System.out.println(mat);
		System.out.println(count(mat,key,n));
		
				
	}

}
