package com.java.all.datastructure.tree;

import javafx.scene.shape.HLineTo;

import com.java.all.datastructure.PQueue;
import com.java.all.datastructure.PQueueException;
import com.java.all.datastructure.PStack;
import com.java.all.datastructure.TreeNode;
import com.java.all.datastructure.queue.PQueueImpl;
import com.java.all.datastructure.stack.PStackImpl;

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
		TreeNode<Integer> hold = root, temp = null;
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

	private void printBFS() throws PQueueException {
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

	public static void main(String[] args) {
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

		tree.printPreorder();
		System.out.println("------------------");
		try {
			tree.printBFS();
			System.out.println("------------------");
		} catch (PQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		tree.printPreorderWithStack();
	}
}
