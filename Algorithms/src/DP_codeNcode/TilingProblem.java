package DP_codeNcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TilingProblem {

	static int M = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(finishTiling(n));
		}
	}

	private static long finishTiling(int n) {
		// TODO Auto-generated method stub
		
		long[][] a1 = new long[][] {{1, 1}};
		long[][] mat = new long[][] {{0,1}, {1,1}};
		
		//Matrix mul for fibonacci  in log(N)
		mat = pow(mat, n-1);
		return mul(a1, mat)[0][1];
	}
	public static long[][] pow(long[][] mat, long n){
		long[][] res = new long[][] {{1,0},{0,1}};
		while(n>0) {
			if(n%2 == 1) {
				res = mul(res,mat);
				n -= 1;
			}
			else {
				mat = mul(mat, mat);
				n /= 2;
			}
		}
		return res;		
	}
	public static long[][] mul(long[][] mat1, long[][] mat2){
		
		long[][] res = new long[mat1[0].length][mat2.length];
		
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat2[0].length; j++) {
				for(int k=0; k<mat1[0].length; k++) {
					long temp = (mat1[i][k]*mat2[k][j])%M;
					res[i][j] = (res[i][j] + temp)%M;
				}
			}
		}
		return res;
	}

}
