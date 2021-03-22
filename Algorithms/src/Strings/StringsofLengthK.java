package Strings;

import java.util.Scanner;

public class StringsofLengthK {
public static String[] allStrings(String charSet, int len){
		
		// Write your code here 
        char[] arr = new char[len];
         String s = charSet;
        helper(len,s,arr);
        return new String[0];
        
	}
    
    public static void helper(int n,String k,char[] A){
        if(n<=0){
            System.out.println(String.valueOf(A)+" ");
        }
        else{
            for(int i=0;i<k.length();i++){
                A[n-1] = k.charAt(i);
                helper(n-1,k,A);
            }
        }

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String charSet = s.next();
		int len = s.nextInt();
		String ans[] = allStrings(charSet, len);
		for(String str : ans){
			System.out.println(str);
		}

	}

}
