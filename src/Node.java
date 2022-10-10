public class Node {
    Node leftChild;
    Node rightChild;
    int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "{" +
            " leftChild='" + getLeftChild() + "'" +
            ", rightChild='" + getRightChild() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }

}
