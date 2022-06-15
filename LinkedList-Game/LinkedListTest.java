public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<GameCharacter> l = new LinkedList<GameCharacter>();
        
        l.addToTail(new GameCharacter("Player"));
        l.addToTail(new Mage("Magician"));
        l.addToTail(new Mage("Necromancer"));
        
        System.out.println(l);
    }
}