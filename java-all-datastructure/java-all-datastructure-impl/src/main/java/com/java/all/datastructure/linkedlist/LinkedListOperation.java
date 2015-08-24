package com.java.all.datastructure.linkedlist;

public class LinkedListOperation implements LinkedList {

	private SinglyNode root;

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

	private SinglyNode createNode(int data) {
		SinglyNode singlyNode = new SinglyNode();
		singlyNode.setData(data);
		return singlyNode;
	}

	public void printList() {
		SinglyNode hold = root;
		while (hold != null) {
			System.out.print("->" + hold.getData());
			hold = hold.getNext();
		}

	}

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
