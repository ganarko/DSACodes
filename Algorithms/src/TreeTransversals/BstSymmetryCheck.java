package TreeTransversals;

import TreeTransversals.GetCousins.TreeNode;

public class BstSymmetryCheck {
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
public int isSymmetricUtil(TreeNode A, TreeNode B) {
	
        if(A == null && B == null){
            return 1;
        }
        if(A != null && B != null){
            
    return isSymmetricUtil(A.left,B.right)>0 && isSymmetricUtil(A.right,B.left)>0 && (A.val==B.val)?1:0;
        }
    return 0;
 }
public int isSymmetric(TreeNode A) {
        if(A==null){
            return 1;
        }
            return isSymmetricUtil(A.left,A.right);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
