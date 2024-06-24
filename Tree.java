import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    TreeNode left;
    int data;
    TreeNode right;

    TreeNode(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}

public class Tree {

    static void preorder(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    static int countNode(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + countNode(root.left) + countNode(root.right);
    }

    static void postorder(TreeNode root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    static void bfs(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalList = new ArrayList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int levels = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < levels; i++) {
                TreeNode node = q.poll();
                temp.add(node.data);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            finalList.add(temp);
        }
        System.out.println(finalList);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // preorder(root);
        // inorder(root);
        // postorder(root);
        // System.out.println(countNode(root));
        bfs(root);

    }

}
