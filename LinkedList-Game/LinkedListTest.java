public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        
        l.addToTail(1);
        System.out.println(l);
        
        l.addToTail(3);
        System.out.println(l);
        
        l.addToTail(new String("Hello"));
        System.out.println(l);

        l.addToTail(new String("foobar"));
        System.out.println(l);

        l.addToTail(new Mage("Magician"));
        System.out.println(l);

        l.addToTail(4);
        System.out.println(l);

        l.delete(3);
        System.out.println(l);

        l.delete("Hello");
        System.out.println(l);
    }
}