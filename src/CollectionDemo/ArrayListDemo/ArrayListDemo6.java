package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(43);
        al.add(56);
        al.add(11);
        al.add(10);
        al.add(45);
        al.add(78);
        al.add(95);
        System.out.println("al="+al);

        ArrayList<Integer> al2 = new ArrayList<>();

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);




    }

}
