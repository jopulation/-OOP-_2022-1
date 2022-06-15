public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        
        l.addToTailRecursion(1);
        System.out.println(l);
        
        l.addToTailRecursion(3);
        System.out.println(l);
        
        l.addToTailRecursion(4);
        System.out.println(l);

        l.delete(3);
        System.out.println(l);
    }
}