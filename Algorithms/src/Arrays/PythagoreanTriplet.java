package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PythagoreanTriplet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] str = br.readLine().split(" ");
		int n = str.length;
	
		int[] arr = new int[n];
		for(int i=0;i<n;i++)arr[i] =Integer.parseInt(str[i]);
		for(int i=0;i<n;i++)arr[i] *=arr[i];
		findTriplet(arr,n);
		

	}

	private static void findTriplet(int[] arr, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		
		for(int i=n-2;i>1;i--) {
			int j = 0;
			int k = i-1;
			
			while(j<k) {
				
				if((arr[k]+arr[j])==arr[i]) {
					System.out.println(arr[j]+", "+arr[k]+", "+arr[i]);
					return;
				}
				else if(arr[k]+arr[j]<arr[i]) {
					j++;
				}
				else k--;
			}
		}
		
		System.out.println("No Py triplets");
		
	}

}
