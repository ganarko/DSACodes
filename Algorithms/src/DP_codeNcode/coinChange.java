package DP_codeNcode;

/*
 * You are given coins of different denominations and 
 * a total amount of money amount. Write a function 
 * to compute the fewest number of coins that you need to make up that amount
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class coinChange {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String[] str = br.readLine().split(" ");
			int n = str.length;
			int sum = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			for(int i=0;i<n;i++)arr[i] = Integer.parseInt(str[i]);
		    
			System.out.println(coinChangeMin(arr,n,sum));
		}
	}

	private static int coinChangeMin(int[] coins, int n, int amount) {
		// TODO Auto-generated method stub
		int[] dp =new int[amount+1];
        int max = Integer.MAX_VALUE;
        Arrays.fill(dp,max);
        dp[0]=0;
        
        for(int i=1;i<=amount;i++){
                int min = max;
                for(int j=0;j<n ;j++)    
                  if(coins[j]<=i) min = Math.min(min,dp[i-coins[j]]);
                
                dp[i] = (min==max)?max:min+1;
        	}
        
        if(dp[amount]==max)return -1;
        
        return dp[amount];  
		
	}

}
