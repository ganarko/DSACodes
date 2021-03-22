package DP_codeNcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class longestPalindromeSubString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String str = br.readLine();
			int n = str.length();
			int l = findLongPalindrome(str,n);
			System.out.println(l);
		}
	}

	private static int findLongPalindrome(String str, int n) {
		// TODO Auto-generated method stub
		
		int[][] dp = new int[n+1][n+1];
		
		for(int i=0;i<n;i++) {
			dp[0][i]=1;
			dp[1][i] =1;
		}
		
		for(int i=2;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(str.charAt(j-1)==str.charAt(j-i) && dp[i-2][j-1]==1)
					dp[i][j]=1;
				else dp[i][j]=0;
			}
		}
		for(int i=n;i>=1;i--) {
			for(int j=0;j<=n;j++)
				if(dp[i][j]==1)return i;
		}
		return -1;
	}

}
