package TreeTransversals;

import java.util.ArrayList;
import java.util.List;

public class ZigZagTree {
	
	 public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		        this.val = val;
		         this.left = left;
		          this.right = right;
		     }
		 }
	 
	 int height(TreeNode root) 
	    { 
	        if (root == null) 
	           return 0; 
	        else
	        { 
	            /* compute  height of each subtree */
	            int lheight = height(root.left); 
	            int rheight = height(root.right); 
	              
	            /* use the larger one */
	            if (lheight > rheight) 
	                return(lheight+1); 
	            else return(rheight+1);  
	        } 
	    } 
	    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        List<List<Integer>> ans = new ArrayList<>();
	        
	        int h = height(root); 
	        int i; 
	         List<Integer> t = new ArrayList();
	        if (root == null) 
	            return ans; 
	        t.add(root.val);
	        ans.add(t);
	        for (i=2; i<=h; i++) 
	        {
	            boolean b ;
	            if(i%2 !=0 )b=true;
	            else b= false;
	            List<Integer> temp = new ArrayList();
	            printGivenLevel(root,i,temp,b);
	            ans.add(temp);
	        }
	        return ans;
	        
	    }
	    
	    
	    void printGivenLevel (TreeNode root ,int level,List<Integer> res,boolean rt) 
	    { 
	        if (root == null) 
	            return; 
	        if (level == 1) 
	            res.add(root.val);
	        else if (level > 1) 
	        { 
	            if(rt)
	            {
	                  printGivenLevel(root.left, level-1,res,rt);
	                 printGivenLevel(root.right, level-1,res,rt);          
	                
	            }
	            else {
	                printGivenLevel(root.right, level-1,res,rt);
	                 printGivenLevel(root.left, level-1,res,rt);
	            }
	        } 
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
