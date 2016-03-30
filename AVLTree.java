/**
 * Implementation of AVL tree data structure that holds Node ojbects 
 * that stores an integer as its data.
 * @author Isaac Mast
 */
public class AVLTree {

	//Declare instance variables
	private Node root;

	/**
	 * Constructs an empty AVL tree.
	 */
	public AVLTree() {
		root = null;
	}

	/**
	 * Constructs an AVL tree by creating a new Node object, newNode, 
	 * and setting it as the tree's root node.
	 * @param data the integer to be stored in the AVL tree's root node
	 */
	public AVLTree(int data) {
		this.root = new Node(data);
	}

	/**
	 * Creates a new Node object that contains an integer, data, and 
	 * inserts it into the AVL tree. 
	 * @param data integer to be stored in the new Node object
	 */
	public void insert(int data) {

	}

	/**
	 * Finds a Node object in the AVL tree that contains the integer, 
	 * data.
	 * @return True if a Node object is found in the AVL tree that 
	 * contains the integer, data
	 * @return False if a Node object is not found in the AVL tree 
	 * that contains the integer, data
	 */
	public boolean find(int data) {
		Node current = root;
		if (current.getData() == data) {
			return True;
		}
		while (current.getData() != data && current != null) {
			if (data < current.data) {
				current = root.getLeftChild();
			} else {
				current = root.getRightChild();
			}
		}
		return False;
	}
}
