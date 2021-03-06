/**
 * 
 */
package com.example.binarytree;

/**
 * @author shubham
 *
 */
public class BinaryTreeTotalNumberLeafNode {

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
		
		System.out.println(new BinaryTreeTotalNumberLeafNode().getTotalNumberOfLeafNodes(root));

	}
	
	public int getTotalNumberOfLeafNodes(Node node) {
		if(node == null) {
			return 0;
		}
		if(node.getLeftNode() == null && node.getRightNode() == null) return 1;
		
		
		return getTotalNumberOfLeafNodes(node.getLeftNode()) + getTotalNumberOfLeafNodes(node.getRightNode());
	}

}
