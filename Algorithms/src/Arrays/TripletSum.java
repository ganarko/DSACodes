package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * Given an array of distinct integers and a sum value. 
 * Find count of triplets with sum smaller than given sum value. Expected Time Complexity is O(n2)
 */
public class TripletSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] str = br.readLine().split(" ");
		int n = str.length;
		int sum = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0;i<n;i++)arr[i] =Integer.parseInt(str[i]);
		
		int ans = tripletSums(arr,n,sum);
		
		System.out.println("");
		
		findTriplets(arr,n,sum);

	}

	private static int tripletSums(int[] arr,int n,int sum) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int ans =0;
		for(int i=0;i<n-1;i++) {
			int j =i+1;
			int k = n-1;
			while(j<k) {
				if(arr[i]+arr[j]+arr[k]>sum)k--;
				else if(arr[i]+arr[j]+arr[k]<sum)j++;
				else {
					//ans += (k-j);
					System.out.print("["+ arr[i]+","+arr[j]+","+arr[k]+"] ");
					ans++;
					j++;
					k--;
				}
			}
			
		}
		
		return ans;
	}
	
	 public static void findTriplets(int a[], int n, int sum){
		 //Unique Triplets with Sum = k
		 	int i;
	       
	        // Sort the input array
	        Arrays.sort(a);
	        System.out.println("Unique Triplets");
	        // For handling the cases when no such 
	        // triplets exits.
	        boolean flag = false;
	        
	        for (i = 0; i < n - 2; i++)
	        {
	            if (i == 0 || a[i] > a[i - 1])
	            {
	                // Index of the first element in 
	                // remaining range.
	                int start = i + 1;
	       
	                // Index of the last element
	                int end = n - 1;
	       
	                // Setting our new target
	                int target = sum - a[i];
	                while (start < end) 
	                {
	                    // Checking if current element 
	                    // is same as previous
	                    if (start > i + 1 && a[start] == a[start - 1]) 
	                    {
	                        start++;
	                        continue;
	                    }
	       
	                    // Checking if current element is 
	                    // same as previous
	                    if (end < n - 1 && a[end] == a[end + 1]) 
	                    {
	                        end--;
	                        continue;
	                    } 
	                    if (target == a[start] + a[end]) 
	                    {
	                        System.out.print("[" + a[i] 
	                             + "," + a[start]
	                             + "," + a[end] + "] ");
	                        flag = true;
	                        start++;
	                        end--;
	                    }
	                    
	                    // If target is greater then
	                    //  increment the start index
	                    else if (target > (a[start] + a[end]))
	                    {
	                        start++;
	                    }
	                    
	                    // If target is smaller than 
	                    // decrement the end index
	                    else {
	                        end--;
	                    }
	                }
	            }
	        }
	 
	        if (flag == false) {
	            System.out.println("No Such Triplets Exits");
	        }
	        else System.out.println("Fuck Off");
	 }
}
