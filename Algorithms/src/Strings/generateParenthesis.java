package Strings;

import java.util.Scanner;

public class generateParenthesis {
public static void printWellFormedParanthesis( int n){
		
		// Write your code here
		if(n==0){
            return;
        }
        String p = "";
        Helper(n,n,p);
      //  for(int i=0;i<n;i++) p+="(";
        
       
        
	}
	 public static void Helper(int o,int c,String s)
	{
		// insert curr into set if we have reached end of both Strings
         if(o==0 && c==0 ){
             System.out.println(s);
             //return;
         }
         if(o>c){
             return;
         }
         if(o>0){
             Helper(o-1,c,s+"(");
         }
          if(c>0){
             Helper(o,c-1,s+")");
         }
         
         
	}
	 static Scanner s = new Scanner(System.in);
	 
		public static void main(String[] args) {
			int n = s.nextInt();
			printWellFormedParanthesis(n);
	}

}
