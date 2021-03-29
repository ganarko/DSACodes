package TreeTransversals;

import java.util.List;

public class sortedArrayToBST {
	 class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) {
		       val = x;
		       left=null;
		       right=null;
		     }
		 }
	public TreeNode sortedArrayToBST(final List <Integer> A) {
	      
	        int n = A.size();
	        int[] a = new int[n];
	        for(int k=0;k<n;k++) a[k] = A.get(k);
	        if(n==1 && A.get(0)==1) return new TreeNode(1);
	        TreeNode root = build(a,0,n);
	        return root;
	    }
	    TreeNode build( int[] arr,int low,int high){

	          if(low > high) return null;
	         int mid = ( low + high ) / 2;
	         if(mid<arr.length){
	                    TreeNode temp = new TreeNode(arr[mid]);
	                     temp.left = build(arr,low,mid-1);
	                    temp.right = build(arr,mid+1,high);
	                 return temp;
	         }
	        return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
