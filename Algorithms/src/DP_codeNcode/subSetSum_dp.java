package DP_codeNcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class subSetSum_dp {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int t = Integer.parseInt(br.readLine());
		while(t>0){
			String[] str = br.readLine().split(" ");
			int n = str.length;
			int sum = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			for(int i=0;i<n;i++)arr[i] =Integer.parseInt(str[i]);
		    
			printSubSetSum(arr,n,sum);
			t--;
		}
		
	}

	private static void printSubSetSum(int[] arr, int n, int sum) {
		// TODO Auto-generated method stub
		int[] dp = new int[sum+1];
		dp[0] =1;
		for(int i=0;i<n;i++) {
			for(int j=sum;j>=arr[i];j--) {
				if(dp[j]>0 || dp[j-arr[i]]==0)continue;
				else dp[j] = arr[i];
			}
		}
		if(dp[sum]==0)System.out.println("No Way");
		else {
			int tot = sum;
			while(tot>0) {
				System.out.print(dp[tot]+" ");
				tot -= dp[tot]; 
			}
			System.out.println();
		}
		return;
	}
}
