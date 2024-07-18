package CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {


        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Karthik");
        lhs.add("Rohini");
        lhs.add("Neeta");
        lhs.add("Amol");
        lhs.add("Sukesh");
        lhs.add("Sumit");
        lhs.add("Aasma");
        System.out.println(lhs.add("Aasma"));

        System.out.println(lhs);

    }
}
