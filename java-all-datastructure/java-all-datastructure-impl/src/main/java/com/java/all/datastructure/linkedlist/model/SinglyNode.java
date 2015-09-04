package com.java.all.datastructure.linkedlist.model;

/**
 * Data structure capable of holding data and pointer to the next record.
 * 
 * @author Illusion
 * @created Aug 24, 2015
 */
public class SinglyNode<T> implements PNode {

	private T data;
	private SinglyNode<T> next;

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
	 * @return the next
	 */
	public SinglyNode<T> getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(SinglyNode next) {
		this.next = next;
	}
}