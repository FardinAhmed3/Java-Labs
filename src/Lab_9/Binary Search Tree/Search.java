public class Search {
    public static <E extends Comparable<E>> boolean search(Node<E> root, E e) {
        if (root == null) {
            return false;
        }

        Node <E> current = root;
        boolean found = false;
        while (current != null) {
            System.out.println("Comparing " + e + " to " + current.data);

            int compare = e.compareTo(current.data);
            if (compare < 0) {
                current = current.left;
            }
            else if (compare > 0) {
                current = current.right;
            }
            else { 
                found = true;
                break;
            }
        }
        return found;
    }
}