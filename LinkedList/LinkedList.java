public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addToTailRecursion(int data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            addToTailImplementation(head, data);
        }
    }

    private void addToTailImplementation(Node n, int data){
        if (n.getNext() == null) {  // reached the end of the list
            n.setNext(new Node(data));
        }
        else {
            addToTailImplementation(n.getNext(), data);
        }
    }

    @Override
    public String toString() {
        String s ="";

        Node node = head;

        while (node != null) {
            s = s + node.getData() + " --> ";
            node = node.getNext();
        }

        s = s + "end(or null)";

        return s;
    }

    /* getter and setter */
    public Node getHead() {
        return head;
    }

    public void setHead(Node h) {
        head = h;
    }
}