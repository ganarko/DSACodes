package TreeTransversals;

import java.util.Stack; 

class Node 
{ 
	int data; 
	Node left, right; 

	public Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

	class BinaryTree 
	{ 
		Node root;
	
public void inorder() 
		{ 
			if (root == null) 
				return; 


			Stack<Node> s = new Stack<Node>(); 
			Node curr = root; 

			// traverse the tree 
			while (curr != null || s.size() > 0) 
			{ 

				/* Reach the left most Node of the 
				curr Node */
				while (curr != null) 
				{ 
					
					s.push(curr); 
					curr = curr.left; 
				} 

				/* Current must be NULL at this point */
				curr = s.pop(); 

				System.out.print(curr.data + " "); 

				
				curr = curr.right; 
			} 
		}
public	void printPreorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first print data of node */
		System.out.print(node.data + " "); 

		/* then recur on left sutree */
		printPreorder(node.left); 

		/* now recur on right subtree */
	//	printPreorder(node.right); 
	} 
	void printPostorder(Node node) 
	{ 
		if (node == null) 
			return; 

		// first recur on left subtree 
		printPostorder(node.left); 

		// then recur on right subtree 
		printPostorder(node.right); 

		// now deal with the node 
		System.out.print(node.data + " "); 
	} 
	
	public static void main(String args[]) 
	{ 

		/* creating a binary tree and entering 
		the nodes */
		
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.inorder();
		System.out.println("\n"+"Post Order");
		tree.printPostorder(tree.root);
		System.out.println("\n"+"Pre Order");
		tree.printPreorder(tree.root);
	}
}
	// non-recursive java program for inorder traversal 


	/* Class containing left and right child of 
	current node and key value*/
	

	/* Class to print the inorder traversal */
	

		
