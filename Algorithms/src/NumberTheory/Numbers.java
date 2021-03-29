package NumberTheory;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Numbers {

	public static BufferedReader input =new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		
		
		int t = Integer.parseInt(input.readLine());

		while(t-->0){
			
			//------------ Input -------------------------- //

			String[] arr = input.readLine().split(" ");

			int a = Integer.parseInt(arr[0]);
			//int b = Integer.parseInt(arr[1]);
			int [][] matrix ={{1,2,3},{0,0,1},{1,1,1}};

			//------------ Input -------------------------- //

			//------------ Functions -------------------------- //

			//System.out.println(gcd(a,b));
			//System.out.println(factorial(a));
			//System.out.println(calculatePower(a,b));
			//System.out.println(primeOrNot(a));
			//System.out.printin(factorial(a));
			/*int[] factors = uniquePrimeFactors(a);
			for(int i=0;i<=a;i++){
				System.out.print(i+": "+factors[i]+"; ");
			}
			*/
			//System.out.println(factorize(a));
			//System.out.println(numberOfDivisors(a));
			//matrixExpo(matrix, a);
			/*Emponentiate Matrix
			for (int i=0; i<3; i++){
				for (int j=0; j<3; j++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println(" ");
				}
				*/
			//System.out.println(fibanocciOptimized(a));

		}
		
	}

	public static int[] segSieve(int low, int high){
		int[] ans = new int[Math.abs(high-low)+1];
		

		return ans;
	}

	public static int numberOfDivisors(int a){

		//NUmber of Divisors Except 1
		int n =  a;
		int div =1;
		for(int i=2;i*i<=a;i++){
			int count =0;
			while(n%i==0 && n>0){
				n = n/i;
				count++;
			}
		   if(count>0)div = div * (count+1);
		}

		return div;

	}
	
	public static String factorize(int a){

		int n =  a;
		StringBuffer ans = new StringBuffer();
		for(int i=2;i*i<=a;i++){
			int count =0;
			while(n%i==0 && n>0){
				n = n/i;
				count++;
			}
		   if(count>0)ans.append(i+"^"+count+" + ");
		}

		if(n==a)ans.append(a+"^"+"1"+ " + ");
		int len = ans.length();
		return ans.toString().substring(0,len-2);

	}
	
	public static int[] uniquePrimeFactors(int a){

		//int lim = (int)Math.sqrt(a) +1;
		//Return Prime Factors for Each Element <=a
		int[] ans = new int[a+1];
		ans[1] =0;

		for(int i=2;i<=(a/2+1);i++){
			
			if(ans[i]==0){

				for(int j=i;j<=a;j+=i){
					ans[j] = ans[j]+1;
				}
			}
		}

		return ans;
	}
	
	public static int factorial(int a){
		
		BigInteger f = new BigInteger("1");
 
        for (int i = 2; i <= a; i++)
            f = f.multiply(BigInteger.valueOf(i));
 
        return f.intValue();

	}

	public static int calculatePower(int a,int n){ 
		int mod = 1000000007;
		int res =1;
	
		while(n>0){
			if((n&1)==1){
				res =  (res%mod * a%mod)%mod;
				n--;
			}
			else{
				a = ((a%mod)*(a%mod)%mod);
				n = n>>1;
			}
		}
		return res;
	}

	public static int gcd(int a,int b){

		if(b==0){
			return a;
		}
		return gcd(b,a%b);

	}

	public static String primeOrNot(int a){

		int m = (int) Math.sqrt(a) +1;

		for(int i=2;i<=m;i++)
			if(a%i==0)return "Not Prime";

		return "Prime";
	}

	public static void matrixExpo(int[][] a,int n){
		
		//Square Matrix Only
		if(n==1)return;

		int r = a.length;
		int c = a[0].length;
		int[][] res = new int[r][c];
		for(int i=0;i<r;i++)res[i][i] =1;

		while(n>0){
			if((n&1)==1){
				mulMatrix(res, a);
				n--;
			}
			else{
				mulMatrix(a, a);
				n = n>>1;
			}
		}

		for (int i=0; i<r; i++)
            for (int j=0; j<c; j++)
                a[i][j] = res[i][j]; 
	}
	
	public static void mulMatrix(int[][] a, int[][] b){
		int r = a.length;
		int c = a[0].length;
		int[][] res = new int[r][c];
		for(int i=0;i<r;i++){
			for(int j =0;j<c;j++){
				for(int k=0;k<c;k++){
					res[i][j] += (a[i][k]*b[k][j]);
				}
			}
		}
		for (int i=0; i<r; i++)
            for (int j=0; j<c; j++)
                a[i][j] = res[i][j]; 

	}
	
	public static int fibanocciOptimized(int n){

		int M[][] = {{1, 1, 1}, {1, 0, 0},{0, 1, 0}};
		matrixExpo(M, n-2);
		return (M[0][0]+M[0][1]);
	}
}
