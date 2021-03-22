package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Given an array of DISTINCT elements, rearrange the elements of array in zig-zag fashion in O(n) time. 
 * The converted array should be in form a < b > c < d > e < f
 *In : 4 3 7 8 6 2 1
 *Out: 3 7 4 8 2 6 1  
 */
public class ZigZagArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] str = br.readLine().split(" ");
		int n = str.length;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)arr[i] =Integer.parseInt(str[i]);
		
		convertZigZag(arr,n);
		
		for(int v: arr)System.out.print(v+" ");
	}

	private static void convertZigZag(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		boolean order = true;
		int temp =0;
		for(int j=0;j<=n-2;j++) {
			int i = j+1;
			if(order) {
				if(arr[j]>arr[i]) {
					//swap(arr[i],arr[j]);
					temp = arr[j];  
                    arr[j] = arr[i];  
                    arr[i] = temp; 
				}
			}
			else {
				if(arr[j]<arr[i]) {
					//swap(arr[i],arr[j]);
					temp = arr[j];  
                    arr[j] = arr[i];  
                    arr[i] = temp;  
				}
			}
			order = !order;
		}
		
	}
	private static void swap(int a,int b) {
		a = a+b;
		b = a-b;
		
	}
	

}
