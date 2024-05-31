public class Search {
    public static <E> boolean search(Node<E> root, E e) {
        return searchWithPrint(root, e);
    }

    private static <E> boolean searchWithPrint(Node<E> root, E e) {
        if (root == null) {
            return false;
        }
        System.out.println("Comparing " + e + " to " + root.data);
        if (root.data.equals(e)) {
        return true;
    }
    return searchWithPrint(root.left, e) || searchWithPrint(root.right, e);
}
}