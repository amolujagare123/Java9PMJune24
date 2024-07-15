package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemoRemoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(43);
        al.add(56);
        al.add(11);

        System.out.println("al="+al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(45);
        al2.add(78);
        al2.add(95);
        al2.add(56);
        al2.add(11);

        System.out.println("al2="+al2);

        al2.removeAll(al);

       System.out.println("al2="+al2);




    }

}
