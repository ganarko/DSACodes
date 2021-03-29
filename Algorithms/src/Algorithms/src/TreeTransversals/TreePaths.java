package TreeTransversals;

import java.util.ArrayList;

import TreeTransversals.MaxDepthOfTree.TreeNode;

public class TreePaths {
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
	//Path To Given NOde
public ArrayList<Integer> solve(TreeNode A, int B) {
        
        ArrayList <Integer> ans = new ArrayList();
        solve(A,B,ans);
        return ans;
    }
    public boolean  solve(TreeNode root, int n, ArrayList<Integer> res ){
    if(root == null) return false;
    
    res.add(root.val);
    
    if(root.val == n) return true;
    
    if(solve(root.left,n,res) || solve(root.right,n,res)) return true;
    
    res.remove(res.size() -1);
    
    return false;
}
//Path SUM
public int hasPathSum(TreeNode A, int B) {
        
        if(A == null ) return 0;
        else if(A !=null && A.right == null && A.left == null && B == A.val) return 1;
        else return (hasPathSum(A.left, B-A.val)==1 || hasPathSum(A.right, B-A.val)==1)?1:0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
