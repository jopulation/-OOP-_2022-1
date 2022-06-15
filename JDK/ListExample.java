import java.util.*;

// Stack: push & pop
public class ListExample {
    public static void main(String[] args) {
        Stack<Integer> data = new Stack<Integer>();

        /* List specific methods */
        data.add(new Integer(100));
        data.add(new Integer(10));
        data.add(new Integer(1000));

        /* Stack specific methods */
        data.push(new Integer(1234));

        System.out.println(data.pop());
        System.out.println(data.pop());
        System.out.println(data.pop());
    }
}
