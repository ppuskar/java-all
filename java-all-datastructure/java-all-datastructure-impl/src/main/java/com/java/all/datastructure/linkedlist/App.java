package com.java.all.datastructure.linkedlist;

public class App {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedListOperation();
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
