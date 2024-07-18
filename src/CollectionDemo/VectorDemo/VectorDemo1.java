package CollectionDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("size = "+v.size()); // 0
        System.out.println("capacity = "+v.capacity()); // 10

        v.add("Karthik");
        v.add("Rohini");
        v.add("Neeta");
        v.add("Amol");
        v.add("Sukesh");
        v.add("Sumit");
        v.add("Aasma");
        v.add("aniket");
        v.add("aniket");
        v.add("aniket");
        v.add("aniket");
        v.add("Karthik");
        v.add("Rohini");
        v.add("Neeta");
        v.add("Amol");
        v.add("Sukesh");
        v.add("Sumit");
        v.add("Aasma");
        v.add("aniket");
        v.add("aniket");
        v.add("aniket");
        v.add(null);
        System.out.println("size = "+v.size()); // 21
        System.out.println("capacity = "+v.capacity()); // 20

        System.out.println(v);

       /*
        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());*/

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());



    }
}
