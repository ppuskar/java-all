package com.java.all.datastructure.tree;

import com.java.all.datastructure.PQueue;
import com.java.all.datastructure.PQueueException;
import com.java.all.datastructure.PStack;
import com.java.all.datastructure.queue.PQueueImpl;
import com.java.all.datastructure.stack.PStackImpl;
import com.java.all.datastructure.tree.model.TreeNode;

/**
 * Binary search tree representation for Integer value
 * 
 * @author Praveen.Puskar
 *
 */
public class BinaryTree {
    TreeNode<Integer> root;

    /**
     * Vreates a new bnode populate value into it and returns the same.
     * 
     * @param data
     *            data to put in every node
     * @return {@link TreeNode}.
     */
    private TreeNode<Integer> createNode(Integer data) {
	TreeNode<Integer> newNode = new TreeNode<Integer>();
	newNode.setData(data);
	return newNode;
    }

    /**
     * Add new node to the binary search tree.
     * 
     * @param data
     *            data to add into the BST.
     */
    public void add(Integer data) {
	TreeNode<Integer> hold = root;
	if (root == null) {
	    root = createNode(data);
	} else {
	    while (hold != null) {

		if (data > hold.getData()) {
		    if (hold.getRight() == null) {
			hold.setRight(createNode(data));
			break;

		    }
		    hold = hold.getRight();
		} else if (data < hold.getData()) {
		    if (hold.getLeft() == null) {
			hold.setLeft(createNode(data));
			break;
		    }
		    hold = hold.getLeft();
		} else {
		    // here duplicate data is tried , break it
		    hold = null;
		}
	    }
	}
    }

    /**
     * prints preorder representation for the tree.
     */
    public void printPreorder() {
	preOrder(root);
    }

    /**
     * using BFS it prints right view of the tree.
     * 
     * @throws PQueueException
     */
    public void printRightView() throws PQueueException {
	// perform BFS
	// @formatter:off
	/**
	 * BFS : 1) enqueue root node as seed 2) deque, -process, - enqueue left
	 * child - - enqueue right child 3) repeat 2 until queue is not empty.
	 */
	// @formatter:on
	// while pushing elements populate the levels
	// after populating, peek into the queue to see if levels are changing

	TreeNode<Integer> hold, next;
	hold = next = null;
	PQueue<TreeNode<Integer>> queue = new PQueueImpl<>();
	root.setLevel(0);
	queue.enqueue(root);

	while (queue.size() != 0) {
	    hold = queue.dequeue();
	    next = queue.peek();

	    if (next == null || next.getLevel() != hold.getLevel()) {
		System.out.println("-" + hold.getData());
	    }
	    if (hold.getLeft() != null) {
		hold.getLeft().setLevel(hold.getLevel() + 1);
		queue.enqueue(hold.getLeft());
	    }
	    if (hold.getRight() != null) {
		hold.getRight().setLevel(hold.getLevel() + 1);
		queue.enqueue(hold.getRight());
	    }
	}

    }

    /**
     * using BFS it prints the left view of the tree.
     * 
     * @throws PQueueException
     */
    public void printLeftView() throws PQueueException {
	// perform BFS
	// @formatter:off
	/**
	 * BFS : 1) enqueue root node as seed 2) deque, -process, - enqueue left
	 * child - - enqueue right child 3) repeat 2 until queue is not empty.
	 */
	// @formatter:on
	// while pushing elements populate the levels
	// after populating, peek into the queue to see if levels are changing

	TreeNode<Integer> hold = null;
	PQueue<TreeNode<Integer>> queue = new PQueueImpl<>();
	root.setLevel(0);
	queue.enqueue(root);

	int level = -1;
	while (queue.size() != 0) {
	    hold = queue.dequeue();
	    if (hold.getLevel() != level) {
		System.out.println("-" + hold.getData());
		level = hold.getLevel();
	    }

	    if (hold.getLeft() != null) {
		hold.getLeft().setLevel(hold.getLevel() + 1);
		queue.enqueue(hold.getLeft());
	    }
	    if (hold.getRight() != null) {
		hold.getRight().setLevel(hold.getLevel() + 1);
		queue.enqueue(hold.getRight());
	    }
	}

    }

    /**
     * recursively prints the preorder.
     * 
     * @param node
     *            {@link TreeNode} representing the current node, whould start
     *            with the root node.
     */
    private void preOrder(TreeNode<Integer> node) {
	if (node == null) {
	    // anchoc condition.
	    return;
	}
	System.out.println(node.getData());
	preOrder(node.getLeft());
	preOrder(node.getRight());
    }

    /**
     * prints Breadth first search for the tree.
     * 
     * @throws PQueueException
     */
    public void printBFS() throws PQueueException {
	TreeNode<Integer> nodeToProcess = null;
	PQueue<TreeNode<Integer>> queue = new PQueueImpl<>();
	queue.enqueue(root);

	while (queue.size() != 0) {
	    nodeToProcess = queue.dequeue();
	    System.out.println(nodeToProcess.getData());
	    // deque node and process it
	    // push left child if present
	    // push right child if present
	    if (nodeToProcess.getLeft() != null) {
		queue.enqueue(nodeToProcess.getLeft());
	    }
	    if (nodeToProcess.getRight() != null) {
		queue.enqueue(nodeToProcess.getRight());
	    }
	}
    }

    /**
     * Prints preorder of the tree using {@link PStack} datastructure.
     */
    private void printPreorderWithStack() {
	TreeNode<Integer> nodeToProcess = null;
	PStack<TreeNode<Integer>> stack = new PStackImpl<>();
	stack.push(root);

	while (stack.size() != 0) {
	    // pop datda, process
	    // push left if not null
	    // push right if not null
	    nodeToProcess = stack.pop();
	    System.out.println(nodeToProcess.getData());
	    if (nodeToProcess.getRight() != null) {
		stack.push(nodeToProcess.getRight());
	    }
	    if (nodeToProcess.getLeft() != null) {
		stack.push(nodeToProcess.getLeft());
	    }
	}
    }

    public void printBottomView() {
	iterateToFindLeaf(root);
    }

    private void iterateToFindLeaf(TreeNode<Integer> node) {
	if (node != null) {
	    if (node.getLeft() == null && node.getRight() == null) {
		System.out.println(node.getData());
	    }
	    iterateToFindLeaf(node.getLeft());
	    iterateToFindLeaf(node.getRight());
	}
    }

    /**
     * Main method.
     * 
     * @param args
     * @throws PQueueException
     */
    public static void main(String[] args) throws PQueueException {
	BinaryTree tree = new BinaryTree();
	tree.add(10);
	tree.add(6);
	tree.add(3);
	tree.add(8);
	tree.add(5);
	tree.add(4);
	tree.add(1);
	tree.add(7);
	tree.add(2);
	tree.add(9);
	tree.printBottomView();

	// System.out.println("Preorder of the tree :");
	// tree.printPreorder();
	// // System.out.println("------------------");
	// // try {
	// System.out.println("BFS for the tree :");
	// tree.printBFS();
	// // System.out.println("------------------");
	// // } catch (PQueueException e) {
	// // // TODO Auto-generated catch block
	// // e.printStackTrace();
	// // }
	//
	 System.out.println("Right view :");
	 tree.printRightView();
	 System.out.println("Left view :");
	 tree.printLeftView();
	// tree.printPreorderWithStack();
    }
}
