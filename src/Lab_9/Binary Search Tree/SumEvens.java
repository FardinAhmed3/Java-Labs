public class SumEvens {
    public static int sumEvens(Node<Integer> root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        if (root.data % 2 == 0) {
            sum += root.data;
        }

        return sum + sumEvens(root.left) + sumEvens(root.right);
    }
}