/**
 * 
 */
package com.example.binarytree;

/**
 * @author shubham
 *
 */
public class BinaryTreeDifferenceOddEvennodes {

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
		
		System.out.println(new BinaryTreeDifferenceOddEvennodes().getDifferenceOddEvenNodes(root));
	}
	
	public int getDifferenceOddEvenNodes(Node node) {
		
		if(node == null) {
			return 0;
		}
		
		return node.getData() - getDifferenceOddEvenNodes(node.getLeftNode()) - getDifferenceOddEvenNodes(node.getRightNode());
	}

}
