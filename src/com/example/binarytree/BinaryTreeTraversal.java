/**
 * 
 */
package com.example.binarytree;

/**
 * @author shubham
 *
 */
public class BinaryTreeTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		Node root = binaryTree.createNode(2);
		root.setLeftNode(binaryTree.createNode(7));
		root.setRightNode(binaryTree.createNode(5));
		root.getLeftNode().setLeftNode(binaryTree.createNode(2));
		root.getLeftNode().setRightNode(binaryTree.createNode(6));
		root.getRightNode().setRightNode(binaryTree.createNode(9));
		root.getLeftNode().getRightNode().setLeftNode(binaryTree.createNode(5));
		root.getLeftNode().getRightNode().setRightNode(binaryTree.createNode(11));
		root.getRightNode().getRightNode().setLeftNode(binaryTree.createNode(4));
		
		System.out.println("In Order"); // left node -> parent node -> right node 
		new BinaryTreeTraversal().inorder(root);
		System.out.println();
		
		System.out.println("Pre Order"); // parent node -> left node -> right node 
		new BinaryTreeTraversal().preorder(root);
		System.out.println();
		
		System.out.println("post Order"); // left node -> right node -> parent node 
		new BinaryTreeTraversal().postorder(root);
		System.out.println();
		
	}
	
	public void inorder(Node node) {
		if(node == null) {
			return;
		}
		
		inorder(node.getLeftNode());
		System.out.println(node.getData() + " ");
		inorder(node.getRightNode());
	}
	
	public void preorder(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.println(node.getData() + " ");
		preorder(node.getLeftNode());
		preorder(node.getRightNode());
	}
	
	public void postorder(Node node) {
		if(node == null) {
			return;
		}
		
		postorder(node.getLeftNode());
		postorder(node.getRightNode());
		System.out.println(node.getData() + " ");
	}

}
