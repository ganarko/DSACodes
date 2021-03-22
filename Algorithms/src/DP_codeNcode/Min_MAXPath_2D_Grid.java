package DP_codeNcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2-D n*m Grid reach top to bottom
 * (from any cell in top row to any cell in last row)
 * MInimize/Maximize Cost while Doing So
 * Directions1 : down/right
 * Directions2 : right/down/downRight/downLeft
 */
public class Min_MAXPath_2D_Grid {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			
			//Adjecency Matrix or Grid
			
		    int[][] arr = new int[n][m];
		    for(int i=0;i<n;i++) {
		    	String[] nums = br.readLine().split(" ");
		    	for(int j=0;j<m;j++) {
		    		arr[i][j] = Integer.parseInt(nums[j]);
		    	}
		    }
		  //(0,x) --> (n,y)
			minimumCostA(arr,n,m);
			
			//(0,0) --> (n,m)
			minimumCostB(arr,n,m);
		
		}

	}

	private static void minimumCostA(int[][] arr, int n, int m) {
		
		int[][] dp = new int[n][m];
		dp[n-1][n-1] = arr[n-1][n-1];
		
		for(int i=m-2;i>=0;i--)dp[n-1][i] = arr[n-1][i]+arr[n-1][i+1];
		for(int i=n-2;i>=0;i--)dp[i][m-1] = arr[i][m-1]+arr[i+1][m-1];
		
		for(int i=n-2;i>=0;i--) {
			for(int j=m-2;j>=0;j--) {
				dp[i][j] = arr[i][j]+ Math.min(dp[i+1][j+1],Math.min(dp[i+1][j], dp[i][j+1]));
			}
		}
		int ans = 1000000;
		for(int i=0;i<m;i++)ans = Math.min(ans, dp[0][i]);
		
		System.out.println(ans);
		
	}

	private static int minimumCostB(int[][] arr, int n, int m) {

		int[][] dp = new int[n][m];
		dp[n-1][n-1] = arr[n-1][n-1];
		
		for(int i=m-2;i>=0;i--)dp[n-1][i] = arr[n-1][i]+arr[n-1][i+1];
		for(int i=n-2;i>=0;i--)dp[i][m-1] = arr[i][m-1]+arr[i+1][m-1];
	    
		for(int i=n-2;i>=0;i--) {
			for(int j=m-2;j>=0;j--) {
				dp[i][j] = arr[i][j]+ Math.max(dp[i+1][j], dp[i][j+1]);
			}
		}
	    	for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			    System.out.print(dp[i][j]+" ");
			}
	    	    System.out.println();
	    	}
		return dp[0][0];
	}

}
