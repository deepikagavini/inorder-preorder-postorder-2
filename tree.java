// import java.util.*;

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class PreorderTraversal {
    public void preorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
}

class InorderTraversal {
    public void inorder(TreeNode node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
}

class PostorderTraversal {
    public void postorder(TreeNode node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }
}

public class tree{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        PreorderTraversal object1 = new PreorderTraversal();
        InorderTraversal object2 = new InorderTraversal();
        PostorderTraversal object3 = new PostorderTraversal();

        System.out.print("Preorder traversal: ");
        object1.preorder(root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        object2.inorder(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        object3.postorder(root);
        System.out.println();
    }
}