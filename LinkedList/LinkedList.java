package LinkedList;

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

    public void addToTailRecursive(int data) {
        if(head == null) {
            head = new Node(data);
        }
        else {
            addToTailImplementation(head, data);
        }
    }

    private void addToTailImplementation(Node n, int data) {
        if(n.getNext() == null) {
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

    public void delete(int data) {
        /* case 1: empty list */
        if(getHead() == null) {
            return;
        }
        /* 1st element to delete */
        if(head.getData() == data) {
            head = head.getNext();
            return;
        }
        /* All the other cases */
        Node node = head;

        while (node.getNext() != null) {
            if(node.getNext().getData() == data) {
                node.setNext(node.getNext().getNext());
            }
            node = node.getNext();
        }
    }
}