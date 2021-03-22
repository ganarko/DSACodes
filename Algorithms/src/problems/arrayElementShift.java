package problems;


//Prefix array for SubArray Sum which is a Multiple of N

import java.util.Stack;

public class arrayElementShift {
	public static int[] alt(int[] a) {
		int n = a.length;
		int[] ans = new int[n];
		int zero=0;
		int pos=0;
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				zero++;
			}
			}
		zero = n-1-zero;
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				ans[zero] = a[i];
				zero++;
			}
			else {
				ans[pos]=a[i];
				pos++;
				
			}
		}
		return ans;
		
		
	}
	public static int sumOfSubarrays(int[] a) {
		int n = a.length;
		int sum = 0;
			for(int i=0;i<n;i++)
				sum += a[i];
		Stack<Integer>  ans= new Stack();
		ans.push(sum-a[0]);
		for(int i=1;i<n;i++) {
			if(sum-a[i]>ans.peek()) {
				ans.pop();
				sum=sum-a[i];
				ans.push(sum);
				}
			}
		return ans.peek();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,22,3,5,0,6,0,9,0,0,90};
		int[] arr1 = {4,5,3,10,24,1};
		
		for(int val: arr1)
			System.out.print(val+" ");
		System.out.print("\n");
		System.out.print("Ans : "+sumOfSubarrays(arr1));
	//	int[] ans = alt(arr);
	//	for(int val: ans)
	//		System.out.print(val+" ");
		
	}

}
