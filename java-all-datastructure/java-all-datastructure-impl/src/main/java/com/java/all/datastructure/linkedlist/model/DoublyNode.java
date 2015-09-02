package com.java.all.datastructure.linkedlist.model;

/**
 * Node containing pointer to left and right nodes along with data and a flag to
 * denote if node has been vosited.
 * 
 * @author Illusion
 *
 */
public class DoublyNode implements PNode {

	private DoublyNode left;
	private int data;
	private DoublyNode right;
	private boolean isVisited;

	/**
	 * @return the left
	 */
	public DoublyNode getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(DoublyNode left) {
		this.left = left;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the right
	 */
	public DoublyNode getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(DoublyNode right) {
		this.right = right;
	}

	/**
	 * @return the isVisited
	 */
	public boolean isVisited() {
		return isVisited;
	}

	/**
	 * @param isVisited
	 *            the isVisited to set
	 */
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

}
