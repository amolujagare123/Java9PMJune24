package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("Karthik");
        al.add("Rohini");
        al.add("Neeta");
        al.add("Amol");
        al.add("Sukesh");
        al.add("Sumit");
        al.add("Aasma");
        al.add("Aasma");
        al.add("aniket");
        al.add(12);
        al.add(34.78);
        al.add('j');
        al.add(true);

      //  System.out.println(al);

        for(Object o : al)
            System.out.println(o);
    }

}
