package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class largestContiguiousSubArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] str = br.readLine().split(" ");
		int n = str.length;
	    Set<Integer> set = new TreeSet<>();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){ 
			int a =Integer.parseInt(str[i]);
			set.add(a);
			//arr[i] = a;
			}
		
		System.out.println(findLength(arr,n));
		return;

	}
	private static int findLength(int arr[],int n) 
    { 
    
        int max_len = 1; // Inialize result 
  
        // One by one fix the starting points 
        for (int i=0; i<n-1; i++) 
        { 
            // Create an empty hash set and add i'th element 
            // to it. 
            HashSet<Integer> set = new HashSet<>(); 
            set.add(arr[i]); 
  
            // Initialize max and min in current subarray 
            int mn = arr[i], mx = arr[i]; 
  
            // One by one fix ending points 
            for (int j=i+1; j<n; j++) 
            { 
                // If current element is already in hash set, then 
                // this subarray cannot contain contiguous elements 
                if (set.contains(arr[j])) 
                    break; 
  
                // Else add curremt element to hash set and update 
                // min, max if required. 
                set.add(arr[j]); 
                mn = Math.min(mn, arr[j]); 
                mx = Math.max(mx, arr[j]); 
  
                // We have already cheched for duplicates, now check 
                // for other property and update max_len if needed 
                if (mx-mn == j-i) 
                    max_len = Math.max(max_len, mx-mn+1); 
            } 
        } 
        return max_len; // Return result 
    } 

}
