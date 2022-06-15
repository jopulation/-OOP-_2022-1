import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();

        data.add(new Integer(100));
        data.add(new Integer(10));
        data.add(new Integer(1000));

        /* before sorting */
        System.out.println("### Before sorting");
        for (Integer d: data) {
            System.out.println(d);
        }
        System.out.println();

        
        /* after sorting */
        // Integer is a Comprable
        System.out.println("### After sorting");
        Collections.sort(data);
        for (Integer d: data) {
            System.out.println(d);
        }
        System.out.println();

        /* GameCharacter example */
        List<GameCharacter> players = new ArrayList<GameCharacter>();

        GameCharacter a = new GameCharacter("Gildong");
        GameCharacter b = new Mage("Dooly");
        GameCharacter c = new Mage("John");

        a.setHealthPoint(100);
        b.setHealthPoint(150);
        c.setHealthPoint(70);

        players.add(a);
        players.add(b);
        players.add(c);

        /* before sorting */
        for (GameCharacter p: players)
        {
            p.printStatus();
            System.out.println();
        }

        Collections.sort(players);

        System.out.println("### After sorting: ");

        for (GameCharacter p: players)
        {
            p.printStatus();
            System.out.println();
        }
    }
}


