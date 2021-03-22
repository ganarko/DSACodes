package DP_codeNcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cuttingRod {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] arr = new int[n+1];
			arr[0]=0;
			for(int i=1;i<=n;i++)arr[i] = Integer.parseInt(str[i-1]);
			int ans = cutRod(n,arr);
			System.out.println(ans);
		}

	}

	//Botton Up
	private static int cutRod(int n,int[] price) {
		// TODO Auto-generated method stub
		int []dp = new int[n+1];
		dp[0]=0;
		//dp[1]=price[0];
		for(int i=1;i<=n;i++) {
			int profit = 0;
			for(int j=1;j<=i;j++) {
				profit = Math.max(profit, price[j]+dp[i-j]);
			}
			dp[i]=profit;
		}
		int ans =0;
		for(int i=0;i<=n;i++)ans=Math.max(ans, dp[i]);
		return ans;
	}

}
