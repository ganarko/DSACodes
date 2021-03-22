package DP_codeNcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Given an array of N elements, check if it is possible to obtain a sum of S, 
 * by choosing some (or none) elements of the array and adding them.
 * 
 */
public class subSetSum_bitMasking {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		 InputStreamReader in = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(in);
		 int t = Integer.parseInt(br.readLine());    
		 while(t>0){
		        	String[] nums = br.readLine().split(" ");
		            int n = nums.length; 
		            int[] arr = new int[n];
		            for(int i=0;i<n;i++)arr[i] = Integer.parseInt(nums[i]); 
		            int sum =  Integer.parseInt(br.readLine());
		            if(findSum(arr,n,sum)==1)
		                System.out.println("YES");
		            else
		                System.out.println("NO");
		            t--;
		        }
		 
	}
	public static int findSum(int[] arr,int n,int total){
		 
		    int lim = 1<<n;
		    for(int mask=0;mask<lim;mask++){
		            int sum =0;
		            for(int i=0;i<n;i++){
		                int bit = 1<<i;
		                if( (bit & mask) !=0)sum+=arr[i];
		            }
		            if(sum==total){
		                return 1;
		            }
		        }
		return -1;
	}
}
