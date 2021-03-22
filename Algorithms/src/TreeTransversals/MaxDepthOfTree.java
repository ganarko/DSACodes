package TreeTransversals;

public class MaxDepthOfTree {
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
	 public int maxDepth(TreeNode A) {
	        
	        if(A==null){
	        return 0;
	        }
	        int lh = maxDepth(A.left);
	        int rh = maxDepth(A.right);
	        
	        return Math.max(lh,rh)+1;
	    }
	 public int minDepth(TreeNode A) {
	        
	        if( A.left == null && A.right == null )
	            return 1;

	        int h1=Integer.MAX_VALUE, h2=Integer.MAX_VALUE;
	        
	        if( A.left != null )
	            h1 = minDepth( A.left ) + 1;
	        
	        if( A.right != null )    
	            h2 = minDepth( A.right ) + 1;
	        
	        return (int)Math.min( h1, h2 );
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
