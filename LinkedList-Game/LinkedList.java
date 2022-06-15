public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addToTail(Object element) 
    {
        Node endNode = new Node(element);

        /* Case I: when the list is empty */
        if (head == null)
        {
            head = endNode;
            return;
        }

        /* Case II: when the list is not empty */
        Node node = head;       

        while (node.getNext() != null)
        {
            node = node.getNext();
        }

        node.setNext(endNode);
    }

    public void addToTailRecursion(Object data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            addToTailImplementation(head, data);
        }
    }

    private void addToTailImplementation(Node n, Object data){
        if (n.getNext() == null) {  // reached the end of the list
            n.setNext(new Node(data));
        }
        else {
            addToTailImplementation(n.getNext(), data);
        }
    }

    public void delete(Object data) {
        /* case 1: empty list */
        if (getHead() == null) {
            return;
        }

        /* 1st element to delete */
        if (head.getData().equals(data) == true) {
            head = head.getNext();
            return;
        }

        /* All the other cases */
        Node node = head;

        while (node.getNext() != null) {
            if (node.getNext().getData().equals(data) == true) {
                node.setNext(node.getNext().getNext());
            }
            node = node.getNext();
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