package com.java.all.datastructure.tree.heap;

/**
 * A Binary Heap is a Binary Tree with following properties.
 * <ol>
 * <li>It is a complete tree (All levels are completely filled except possibly
 * the last level and the last level has all keys as left as possible). This
 * property of Binary Heap makes them suitable to be stored in an array.</li>
 * <li>A Binary Heap is either Min Heap or Max Heap. In a Min Binary Heap, the
 * key at root must be minimum among all keys present in Binary Heap. The same
 * property must be recursively true for all nodes in Binary Tree. Max Binary
 * Heap is similar to Min Heap.</li>
 * </ol>
 * 
 * @author Illusion
 *
 * @created 9:44:07 AM, Dec 4, 2015
 */
public interface BinaryHeap<T> {

	/**
	 * checks if the underlying tree is empty.
	 * 
	 * @return true if no element is found in the tree, false otherwise.
	 */
	boolean isEmpty();

	/**
	 * Peek operation returns max/min element. depending on the implementation.
	 * 
	 * @return Max/Min of the tree
	 */
	T peek();

	/**
	 * Add element to the underlying data structure, keeping in mind the heap
	 * properties.
	 * 
	 * @param t
	 *            the element to add.
	 */
	void add(T t);

	/**
	 * Removes element from the underlying tree, maintaining the heap
	 * properties.
	 * 
	 * @param t
	 *            the element to delete
	 */
	T remove();
}
