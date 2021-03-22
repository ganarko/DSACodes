package Arrays;
/*
 * Given a sorted array (sorted in non-decreasing order) of positive numbers, 
 * find the smallest positive integer value that cannot be represented as 
 * sum of elements of any subset of given set.
 * Expected time complexity is O(n)
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SmallestIntegerAsSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] str = br.readLine().split(" ");
		int n = str.length;
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){ 
			int a =Integer.parseInt(str[i]);
			arr[i] = a;
			}
		int ans = findInteger(arr,n);
		System.out.println(ans);
		return;

	}

	private static int findInteger(int[] arr, int n) {
		// TODO Auto-generated method stub
		int res = 1;  
		  
        // Traverse the array and increment 'res' if arr[i] is 
        // smaller than or equal to 'res'. 
        for (int i = 0; i < n && arr[i] <= res; i++) 
            res = res + arr[i]; 
  
        return res; 

	}

}
