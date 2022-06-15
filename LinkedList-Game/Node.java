public class Node<T> {
    private T data;
    private Node<T> next;

    public Node() {
        data = null;
        next = null;
    }

    public Node(T initialData) {
        data = initialData;
        next = null;
    }

    /* getter anf setter */

    public T getData() {
        return data;
    }

    public void setData(T d) {
        data = d;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> n) {
        next = n;
    }

    public static void main(String[] args) {
        Node<Integer> n = new Node(1);

        Node<Integer> n2 = new Node();
        n2.setData(10);

        Node<String> n3 = new Node();
        n3.setData("Hello");

        System.out.println("n: "+ n.getData());
        System.out.println("n2: "+ n2.getData());
        System.out.println("n3: "+ n3.getData());
    }
}
