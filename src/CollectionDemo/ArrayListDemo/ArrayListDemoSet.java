package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemoSet {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(43);
        al.add(56);
        al.add(11);
        al.add(16);
        al.add(17);

        System.out.println("al="+al);

        al.set(5,555);

        System.out.println("al="+al);







    }

}
