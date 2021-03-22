package problems;

import java.util.Scanner;

public class StringCodes {
	 
		
		public static  String[] getCode(String input){
	          if(input.length()==0){
	            String ans[]={""};
	            return ans;
	        }
	        int c1=input.charAt(0)-'0';
	        String result1[]=getCode(input.substring(1));
	        String result2[]=new String[0];
	        int c2 = 0;

	        if(input.length()>=2){
	            c2 = (input.charAt(0)-'0')*10 + (input.charAt(1)-'0');
	            if(c2>10 && c2<=26)
	                result2 = getCode(input.substring(2));

	        }
	        
	            String ans[]=new String[result1.length+ result2.length];
	        
	        int k=0;
	          for(int i=0;i<result1.length;i++)
	         {
	              char ch = (char)(96+c1);
	             ans[k]=ch+result1[i] ;
	              k++;
	         } 
	        for(int i=0;i<result2.length;i++)
	         {
	              char ch = (char)(96+c2);
	             ans[k]=ch+result2[i] ;
	              k++;
	         }
	        
	        return ans;
	        /*
	        abc[0] = '?';
	        for(char c='a';c<='z';c++)abc[c-'a'+1]= c;
			// Write your code here
	        */
			
		}
	    public static void helper(String s,int i){
	        String a = s.substring(0,1);
			String b = s.substring(0,2);
	        
	        int x = Integer.valueOf(a);
	        

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = StringCodes.getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
