public class BinaryTree {
   Node root;
   
    public BinaryTree() {
        this.root = null;
    }

    public Node appendNode(int value, Node node) {
        if (node == null) {
            node = this.root;
        }

        if (node.value > value) {
            if (node.leftChild == null) {
                node.setLeftChild(new Node(value));
                return node.leftChild;
            } else {
                appendNode(value, node.leftChild);
            }
        } else {
            if (node.rightChild == null) {
                node.setRightChild(new Node(value));
                return node.rightChild;
            } else {
                appendNode(value, node.rightChild);
            }
        }
        return null;
    }

    public Node searchByValue(int value, Node node) {
        if (node == null) {
            node = this.root;
        }
        
        if (node.value == value) {
            return node;
        } else if (node.value > value) {
            if (node.leftChild == null) {
                return null;
            }
            return searchByValue(value, node.leftChild);
        } else {
            if (node.rightChild == null) {
                return null;
            }
            return searchByValue(value, node.rightChild);
        }
    }

    public Node getRoot() {
        return this.root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
