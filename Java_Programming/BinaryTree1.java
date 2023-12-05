import java.util.*;

public class BinaryTree1 {
    public static void main(String[] args) {
        TreeNodeNew root = new TreeNodeNew(1);
        root.left = new TreeNodeNew(1);
        root.right = new TreeNodeNew(2);
        root.left.left = new TreeNodeNew(1);
        root.left.right = new TreeNodeNew(2);
        List<Integer> TreeValues = new ArrayList<>();
        printTree(root, TreeValues);
        System.out.println(TreeValues);
    }

    public static void printTree(TreeNodeNew root, List<Integer> TreeValues) {
        List<Integer> Tree = new ArrayList<>();
        TreeNodeNew current = root;
        if (root != null) {
            // System.out.println(root.val);
            Tree.add(root.val);
            if (root.left != null) {
                // System.out.println("Left:");
                // printTree(root.left);
                Tree.add(root.left.val);
                current = root.left;
            }
            if (root.right != null) {
                // System.out.println("Right:");
                // printTree(root.right);
                Tree.add(root.right.val);
                current = root.right;
            }
        }
        System.out.println(Tree.toString());
    }
}

class TreeNodeNew {
    int val;
    TreeNodeNew left;
    TreeNodeNew right;

    TreeNodeNew() {

    }

    TreeNodeNew(int val) {
        this.val = val;
    }

    TreeNodeNew(int val, TreeNodeNew left, TreeNodeNew right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}