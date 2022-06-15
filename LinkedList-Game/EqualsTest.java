public class EqualsTest {
    public static void main(String[] args)
    {
        String s1 = new String("hello");
        String s2 = new String("hello");

        GameCharacter m1 = new Mage("magician");
        GameCharacter m2 = new Mage("magician");

        System.out.println("# String");
        System.out.println("Reference: " + (s1 == s2));
        System.out.println("Data:" + s1.equals(s2));

        System.out.println("# Mage");
        System.out.println("Reference: " + (m1 == m2));
        System.out.println("Data: " + m1.equals(m2));
    }
}


