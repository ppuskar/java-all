package com.java.all.datastructure.linkedlist;

/**
 * Implementation for {@link LinkedList}
 * 
 * @author Illusion
 * @created Aug 24, 2015
 */
public class LinkedListOperation implements LinkedList {

	private SinglyNode root;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void add(int data) {
		SinglyNode nodeToAdd = createNode(data), hold = root;
		if (root == null) {
			root = nodeToAdd;
		} else {
			while (hold.getNext() != null) {
				hold = hold.getNext();
			}
			hold.setNext(nodeToAdd);
		}
	}

	/**
	 * creates a new node with valud as data.
	 * 
	 * @param data
	 *            the value which will be populated as data inside the node.
	 * @return {@link SinglyNode}
	 */
	private SinglyNode createNode(int data) {
		SinglyNode singlyNode = new SinglyNode();
		singlyNode.setData(data);
		return singlyNode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printList() {
		SinglyNode hold = root;
		while (hold != null) {
			System.out.print("->" + hold.getData());
			hold = hold.getNext();
		}

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void reverse() {
		SinglyNode curr = root, prev = null, next = null;
		while (curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		root = prev;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteNode(int data) {
		SinglyNode hold = root, temp;
		while (hold.getNext() != null) {
			temp = hold.getNext();
			if (hold.getData() == data) {
				System.out.println("Found :" + data);
				hold.setNext(temp.getNext());
				// free(temp)
				break;
			}
			hold = temp;
		}
	}
}