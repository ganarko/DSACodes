package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 
 * Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), 
 * reverse the string in a way that special characters are not affected.
 * Input:   str = "Ab,c,de!$"
 * Output:  str = "ed,c,bA!$"
 */
public class ReverseString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String str = br.readLine(); 
        char[] charArray = str.toCharArray(); 
  
        System.out.println("Input string: " + str);
        
         reverse(charArray);
         
        String revStr = new String(charArray); 
  
        System.out.println("Output string: " + revStr); 

	}
	
	 public static void reverse(char str[]) 
	 { 
		 int n = str.length;
		 int l =0;
		 int r = n-1;
		 char a ;
		 char b;
		 while(l<r) {
			 a = str[l];
			 b = str[r];
			 if(!Character.isAlphabetic(a)) {
				 l++;
			 }
			 else if(!Character.isAlphabetic(b)) {
				 r--;
			 }
			 else {
				 str[l] = b;
				 str[r] = a;
				 l++;
				 r--;
			 }
		 }
	 }

}
