package TreeTransversals;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	static class Node { 
	    int data; 
	    Node left, right; 
	  
	    public Node(int item) { 
	        data = item; 
	        left = null; 
	        right = null; 
	    } 
	} 
	static void printLevelOrder(Node root)  
    { 
        Queue<Node> queue = new LinkedList<Node>(); 
       // Node root = new Node(10);
		queue.add(root); 
        while (!queue.isEmpty())  
        { 
  
            Node tempNode = queue.poll(); 
            System.out.print(tempNode.data + " "); 
  
            /*Enqueue left child */
            /*Enqueue right child */
            if (tempNode.right != null) { 
                queue.add(tempNode.right); 
            } 
            
            if (tempNode.left != null) { 
                queue.add(tempNode.left); 
            } 
  
            
        } 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Node root = new Node(3);
			root.left = new Node(2); 
	        root.right = new Node(4); 
	        root.left.left = new Node(1); 
	        root.left.right = new Node(5);
	        printLevelOrder(root);
	        
	}

}
