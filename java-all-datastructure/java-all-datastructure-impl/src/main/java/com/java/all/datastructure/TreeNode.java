package com.java.all.datastructure;

/**
 * Node representing datastructure to represent a tree.
 * 
 * 
 * @author Praveen.Puskar
 *
 * @param <T>
 *            datatype which the tree nodes will hold.
 */
public class TreeNode<T> {
	private T data;
	private TreeNode<T> right;
	private TreeNode<T> left;
	private int level;

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the right
	 */
	public TreeNode<T> getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	/**
	 * @return the left
	 */
	public TreeNode<T> getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
}
