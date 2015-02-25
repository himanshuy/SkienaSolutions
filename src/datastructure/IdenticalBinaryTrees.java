package datastructure;

public class IdenticalBinaryTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean compareBinaryTree(Tree root1, Tree root2) {
		if(root1 == null && root2 == null) {
			return true;
		} else if(root1 != null && root2 != null) {
			return(root1.data == root2.data &&
					compareBinaryTree(root1.left, root2.left) &&
					compareBinaryTree(root1.right, root2.right));
		} else {
			return false;
		}
	}

}
