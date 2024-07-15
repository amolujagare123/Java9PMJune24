package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo5 {

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

        System.out.println(al);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value to be removed");
        Integer val = sc.nextInt();

       // al.remove(Integer.valueOf(10));

        al.remove(val);

        System.out.println(al);


    }

}
