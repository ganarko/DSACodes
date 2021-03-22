package DP_codeNcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Steps at a Time 1/2/3 steps at a time
//Fibinocci Sequence Application
public class stairCaseproblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
	    int t = Integer.parseInt(br.readLine());
	    int lim = 1000001;
	    int mod = 100000009;
	    int[] dp =new int[lim];
	    dp[1] = 1;
	    dp[2] = 2;
	    dp[3] = 4;
	    for(int i=4;i<lim;i++) {
	    	dp[i] = ((dp[i-1]%mod)+(dp[i-2]%mod)+(dp[i-3]%mod))%mod;
	    }
		while(t>0){
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp[n]);
			t--;
		}
		return;
	}

}
