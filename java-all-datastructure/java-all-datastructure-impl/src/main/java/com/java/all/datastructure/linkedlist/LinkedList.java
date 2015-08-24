package com.java.all.datastructure.linkedlist;

/**
 * Interface defining Method for operations over a linked list.
 * 
 * @author Illusion
 * @created Aug 24, 2015
 */
public interface LinkedList {

	/**
	 * Add data to linked list.
	 * 
	 * @param data
	 *            data to add.
	 */
	void add(int data);

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
	void deleteNode(int data);
}
