package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Karthik");
        al.add("Rohini");
        al.add("Neeta");
        al.add("Amol");
        al.add("Sukesh");
        al.add("Sumit");
        al.add("Aasma");
        al.add("Aasma");
        al.add("aniket");

        System.out.println(al);

       /* for(int i=0;i< al.size() ; i++)
           System.out.println(al.get(i));*/

        for(String var : al )
            System.out.println(var);
    }

}
