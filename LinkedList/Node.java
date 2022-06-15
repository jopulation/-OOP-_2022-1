public class Node {
    private int data;
    private Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int initialData) {
        data = initialData;
        next = null;
    }

    /* getter anf setter */

    public int getData() {
        return data;
    }

    public void setData(int d) {
        data = d;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }

    public static void main(String[] args) {
        Node n = new Node(1);

        Node n2 = new Node();
        n2.setData(10);

        System.out.println("n: "+ n.getData());
        System.out.println("n2: "+ n2.getData());
    }
}
