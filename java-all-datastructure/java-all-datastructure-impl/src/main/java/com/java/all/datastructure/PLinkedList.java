package com.java.all.datastructure;

/**
 * Interface defining Method for operations over a linked list.
 * 
 * @author Illusion
 * @created Aug 24, 2015
 */
public interface PLinkedList<T> {

	/**
	 * Add data to linked list.
	 * 
	 * @param data
	 *            data to add.
	 */
	void add(T data);

	/**
	 * print all data inside a linked-list.
	 */
	void printList();

	/**
	 * reverse the linked list.
	 */
	void reverse();

	/**
	 * deletes node with value=data from the linked list.
	 * 
	 * @param data
	 */
	void deleteNode(T data);
}
