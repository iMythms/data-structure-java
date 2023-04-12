package Lab16;

public class Node {
    private int data;
    public Node leftChild;
    public Node rightChild;

    public Node() {
        data = 0;
        leftChild = null;
        rightChild = null;
    }

    public Node(int value) {
        data = value;
        leftChild = null;
        rightChild = null;
    }

    public void setData(int value) {
        data = value;
    }

    public int getData() {
        return data;
    }
}
