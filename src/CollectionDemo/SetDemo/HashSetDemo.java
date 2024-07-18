package CollectionDemo.SetDemo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {


        HashSet<String> hs = new HashSet<>();
        hs.add("Karthik");
        hs.add("Rohini");
        hs.add("Neeta");
        hs.add("Amol");
        hs.add("Sukesh");
        hs.add("Sumit");
        hs.add("Aasma");
        System.out.println(hs.add("Aasma"));

        System.out.println(hs);

    }
}
