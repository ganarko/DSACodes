package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class slidingWindowAlgo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String str = br.readLine();
			int n = str.length();
			String pattern = br.readLine();
			int m =pattern.length();
			slideWindow(str,n,pattern,m);
		}

	}

	private static void slideWindow(String str, int n, String pattern,int m) {
		// TODO Auto-generated method stub
		
		for(int i=0,j=m-1;j<n;i++,j++)
			if(match(i,j,str,pattern))
				System.out.print(i+" ");
		 
		System.out.println();
	}

	private static boolean match(int i, int j, String str, String pattern) {
		// TODO Auto-generated method stub
		for(int k=0;k<pattern.length();k++)
			if(str.charAt(i+k)!=pattern.charAt(i))return false;
		return true;
	}

}
