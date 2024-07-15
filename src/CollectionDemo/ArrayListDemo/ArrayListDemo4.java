package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
      //  System.out.println(al.isEmpty()); // true
        al.add("Karthik");
        al.add("Rohini");
        al.add("Neeta");
        al.add("Amol");
        al.add("Sukesh");
        al.add("Sumit");
        al.add("Aasma");
        al.add("aniket");
     //   System.out.println(al.isEmpty()); // false

       System.out.println(al);

     //  al.clear();

    //    al.remove("Neeta");
        al.remove(3);

        System.out.println(al);


    }

}
