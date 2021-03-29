package TreeTransversals;

import java.util.TreeSet;

 class treeTransversals
	{ 
	static class Node 
	{ 
		int data,key;
		Node left, right; 

		public Node(int item) 
		{ 
			data = item;
			key=data;
			left = right = null; 
		}

		public void insert(int value) {
			// TODO Auto-generated method stub
		if(value==data) return;
			
			if(value<data) {
				if(left == null) {
					left = new Node(value);
					//System.out.println(value);
				}
				else {
					left.insert(value);
				}
			}
			
			else {
				if(right == null) {
					right = new Node(value);
					//System.out.println(value);
				}
				else {
					right.insert(value);
				}
			}
			
		} 
	} 
	// Root of Binary Tree 
	Node Root; 

	treeTransversals() 
	{ 
		Root = null; 
	} 
	void insert(int value) {
		if(Root == null) {Root = new Node(value);
		//System.out.println(value);
		}
		
		else {
			 Root.insert(value);
		}
	}
	/* Given a binary tree, print its nodes according to the 
	"bottom-up" postorder traversal. */
	void printPostorder(Node node) 
	{ 
		if (node == null) 
			return; 

		// first recur on left subtree 
		printPostorder(node.left); 

		// then recur on right subtree 
		printPostorder(node.right); 

		// now deal with the node 
		System.out.print(node.key + " "); 
	} 

	/* Given a binary tree, print its nodes in inorder*/
	void printInorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first recur on left child */
		printInorder(node.left); 

		/* then print the data of node */
		System.out.print(node.key + " "); 

		/* now recur on right child */
		printInorder(node.right); 
	} 

	/* Given a binary tree, print its nodes in preorder*/
	void printPreorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first print data of node */
		System.out.print(node.key + " "); 

		/* then recur on left sutree */
		printPreorder(node.left); 

		/* now recur on right subtree */
		printPreorder(node.right); 
	} 

	// Wrappers over above recursive functions 
	void printPostorder() {	 printPostorder(Root); } 
	void printInorder() {	 printInorder(Root); } 
	void printPreorder() {	 printPreorder(Root); } 


	public static void main(String[] args) {
		
		//TreeSet tr = new tree();
		treeTransversals br = new treeTransversals();
		
		int [] arr = {67,89,40,45,46,97,15};
		for(int i=0;i<arr.length;i++) {
			//((Node) tr).insert(arr[i]);
			br.insert(arr[i]);
		}
		System.out.println("Trees ");
		//tr.treverse();
		System.out.println("\n"+"In Order Trees ");
		br.printInorder();
		System.out.println("\n"+"Post Order Trees ");
		br.printPostorder();
		System.out.println("\n"+"Pre Order Trees ");
		br.printPreorder();
	
		
		
	}

}

