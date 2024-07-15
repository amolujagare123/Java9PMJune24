package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListSetDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Karthik");
        al.add("Rohini");
        al.add("Neeta");
        al.add("Amol");

        System.out.println(al);

        al.set(2,"Varun");

        System.out.println(al);
    }
}
