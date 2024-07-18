package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemoRemoveIf2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Karthik");
        al.add("Rohini");
        al.add("Neeta");
        al.add("Amol");
        al.add("Sukesh");
        al.add("Sumit");
        al.add("Aasma");
        al.add("Anil");
        al.add("aniket");


       System.out.println(al);

       // remove all elements that starts with 'A'

     //   al.removeIf(a -> a.toString().startsWith("A")); // if the list is not specific
     //   al.removeIf(a -> a.startsWith("A"));

        // remove all elements whose length is greater than 5

        al.removeIf(a -> a.length()>5);

        System.out.println(al);


    }

}
