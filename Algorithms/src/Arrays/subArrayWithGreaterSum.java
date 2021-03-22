package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Given an array of integers and a number x, 
 * find the smallest sub-array with sum greater than the given value. 
 * 
 */
public class subArrayWithGreaterSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] str = br.readLine().split(" ");
		int n = str.length;
		int[] arr = new int[n];
		int[] cumSum =new int[n];
		arr[0] = Integer.parseInt(str[0]);
		cumSum[0]=arr[0];
		for(int i=1;i<n;i++){ 
			int a =Integer.parseInt(str[i]);
			arr[i] = a;
		    cumSum[i] = a+cumSum[i-1];
			}
		int sum =Integer.parseInt(br.readLine());
		int ans = findSubArray(cumSum,n,sum);
		int ans1 = smallestSubWithSum(arr,n,sum);
		if(ans<=n)
		System.out.println(ans+" "+ans1);
		else System.out.println("Not Possible");
		return;

	}

	private static int findSubArray(int[] arr, int n,int sum) {
		// TODO Auto-generated method stub
		int len = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			int temp =0;
			while(i<n && arr[i]<sum) {
				i++;
				//len = Math.min(len,i+1);
				//break;
			}
			int j = 0;
			while(i<n&& j<n && arr[i]-arr[j]>sum) {
				j++;
			}
			
			len = i-j;
		}
		if(len==n)return n+1;
		return len;
	}
	private static int smallestSubWithSum(int arr[], int n, int x)
    {
        // Initialize current sum and minimum length
        int curr_sum = 0, min_len = n + 1;
 
        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than or equal to x
            while (curr_sum <= x && end < n)
                curr_sum += arr[end++];
 
            // If current sum becomes greater than x.
            while (curr_sum > x && start < n) {
                // Update minimum length if needed
                if (end - start < min_len)
                    min_len = end - start;
 
                // remove starting elements
                curr_sum -= arr[start++];
            }
        }
        return min_len;
    }

}
