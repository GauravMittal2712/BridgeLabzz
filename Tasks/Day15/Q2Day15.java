class Node2<T extends Comparable<T>> {

    T data;
    Node2<T> left;
    Node2<T> right;

    Node2(T data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree<T extends Comparable<T>> {

    Node2<T> root;

    // Insert node
    public void add(T data) {
        root = insert(root, data);
    }

    private Node2<T> insert(Node2<T> node, T data) {

        if (node == null) {
            return new Node2<>(data);
        }

        if (data.compareTo(node.data) < 0) {
            node.left = insert(node.left, data);
        }
        else if (data.compareTo(node.data) > 0) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    // Search node
    public boolean search(T data) {
        return searchNode(root, data);
    }

    private boolean searchNode(Node2<T> node, T data) {

        if (node == null) {
            return false;
        }

        if (data.compareTo(node.data) == 0) {
            return true;
        }

        if (data.compareTo(node.data) < 0) {
            return searchNode(node.left, data);
        }

        return searchNode(node.right, data);
    }

    // Size of tree
    public int size() {
        return sizeOfTree(root);
    }

    private int sizeOfTree(Node2<T> node) {

        if (node == null) {
            return 0;
        }

        return 1 + sizeOfTree(node.left) + sizeOfTree(node.right);
    }

    // Inorder Traversal
    public void inorder() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node2<T> node) {

        if (node != null) {

            inorderTraversal(node.left);

            System.out.print(node.data + " ");

            inorderTraversal(node.right);
        }
    }
}

public class Q2Day15 {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst =
                new BinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        System.out.println("Inorder Traversal:");
        bst.inorder();

        System.out.println("\n\nSize of BST: " + bst.size());

        System.out.println("Search 63: " + bst.search(63));
    }
}