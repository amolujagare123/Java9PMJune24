package CollectionDemo.Stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("amol");
        s.push("rohini");
        s.push("karthik");
        s.push("uday");
        s.push("divya");

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
    }
}
