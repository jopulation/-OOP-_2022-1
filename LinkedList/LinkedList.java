public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addToTail(int element) {
        Node endNode = new Node(element);

        /* Case 1: when the list is empty */
        if (head == null) {
            head = endNode;
            return;
        } 

        /* Case 2: when the list is not empty */
        Node node = head;

        while (node.getNext() != null) {
            node = node.getNext();
        }

        node.setNext(endNode);
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