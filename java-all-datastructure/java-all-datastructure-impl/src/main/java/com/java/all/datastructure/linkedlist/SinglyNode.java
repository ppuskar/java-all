package com.java.all.datastructure.linkedlist;

/**
 * Data structure capable of holding data and pointer to the next record.
 * 
 * @author Illusion
 * @created Aug 24, 2015
 */
public class SinglyNode {

	private int data;
	private SinglyNode next;

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
	 * @return the next
	 */
	public SinglyNode getNext() {
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