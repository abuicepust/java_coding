import java.util.*;

public class BinaryTree2 {
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

        if(root != null){
            TreeValues.add(root.val);
            if (root.left != null) {
                printTree(root.left, TreeValues);
            }
            if (root.right != null) {
                printTree(root.right, TreeValues);
            }
        }
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