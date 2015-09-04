package com.java.all.datastructure.linkedlist;

import com.java.all.datastructure.PLinkedList;

public class App {
	public static void main(String[] args) {
		PLinkedList<Integer> linkedList = new LinkedListOperation<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);

		linkedList.printList();
		linkedList.reverse();
		System.out.println();
		linkedList.printList();
		System.out.println();
		linkedList.deleteNode(90);
		linkedList.printList();
		linkedList.deleteNode(10);
		linkedList.printList();
		linkedList.deleteNode(60);
		linkedList.printList();
		linkedList.deleteNode(30);
		linkedList.printList();
	}

}
