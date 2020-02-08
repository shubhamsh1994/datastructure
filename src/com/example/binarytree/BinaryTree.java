/**
 * 
 */
package com.example.binarytree;

/**
 * @author shubham
 *
 */
public class BinaryTree {

	public Node createNode(int k) {
		
		Node node = new Node();
		node.setData(k);
		node.setLeftNode(null);
		node.setRightNode(null);
		
		return node;
	}
}
