package Strings;

import java.util.Scanner;

public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		String dump = input.nextLine();
		
		while(T>0){
		    String a =  input.nextLine();
		   // System.out.println(a);
		   String x = ""+".";
		    String  ans[] = a.split("\\.");
		    
		    for(int i=ans.length-1;i>0;i--){
		        
		        System.out.print(ans[i]+".");
		    }
		    System.out.print(ans[0]+"\n");
		    
		    T--;
		}
	}

}
