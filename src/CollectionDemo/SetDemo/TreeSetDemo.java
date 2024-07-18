package CollectionDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {


        TreeSet lhs = new TreeSet();
        lhs.add("Karthik");
        lhs.add("Rohini");
        lhs.add("Neeta");
        lhs.add("Amol");
        lhs.add("Sukesh");
        lhs.add("Sumit");
        lhs.add("Aasma");
      //  lhs.add(4);
        System.out.println(lhs.add("Aasma"));

        System.out.println(lhs);

    }
}
