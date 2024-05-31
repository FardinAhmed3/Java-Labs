public class BinaryTreeSize{
	
    public static <E> int size(BinaryTree.Node<E> root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
    }