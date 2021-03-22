package TreeTransversals;

public class invertBinaryTree {
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
	
public TreeNode invertTree(TreeNode A) {
        
        //TreeNode ans = new TreeNode(A.val);
        
        if(A!=null) {
            
            invertTree(A.left);
            invertTree(A.right);
            TreeNode temp=A.left;
            
            A.left = A.right;
            A.right = temp;
            return A;
        }
    else return null;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
