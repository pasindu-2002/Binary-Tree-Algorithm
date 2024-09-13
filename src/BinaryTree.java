public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data){
        Node temp = new Node(data);
        if(root == null){
            root = temp;
            System.exit(1);
        }

        if(root.rightNode == null && root.leftNode == null){
            if (root.data>data){
                root.leftNode = temp;
            }
            else {
                root.rightNode = temp;
            }
            System.exit(1);
        }
    }
}
