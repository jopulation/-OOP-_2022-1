import java.util.*;

// List & ArrayList
public class ListExample {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();

        data.add(new Integer(100));
        data.add(new Integer(10));
        data.add(new Integer(1000));

        for(Integer d: data) {
            System.out.println(d);
        }
    }
}
