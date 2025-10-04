class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

   
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }

  
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.key + " ");
        preorder(node.left);
        preorder(node.right);
    }

  
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key + " ");
    }
}
