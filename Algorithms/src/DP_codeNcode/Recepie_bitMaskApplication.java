package DP_codeNcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * Match using Bit Masking for Completion
 */
public class Recepie_bitMaskApplication {

	static int mod = 1000000007;
	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int t = Integer.parseInt(br.readLine());
		long dp[] = new long[32];
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			Arrays.fill(dp,0);
			for(int i=0;i<n;i++){
					String str = br.readLine();
					int mask =0;
					int p =0;
					while(p<str.length()) {
						char c = str.charAt(p++);
						if(c=='a') mask = mask | (1<<0);
						if(c=='e') mask = mask | (1<<1);
						if(c=='i') mask = mask | (1<<2);
						if(c=='o') mask = mask | (1<<3);
						if(c=='u') mask = mask | (1<<4);
					}
				dp[mask]++;
			}
			
			long res =0;
			
			for(int i=1;i<32;i++) {
				
				for(int j=i+1;j<32;j++) {
					
					if((i|j)==31) {
						res = res + (dp[i]*dp[j]);
						res = res;
					}
				}		
			}
			
			res = res + (dp[31]*(dp[31]-1)) /2;
			System.out.println(res);
		}

	}

}
