package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemoRemoveIf {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(43);
        al.add(56);
        al.add(11);
        al.add(56);
        al.add(13);
        al.add(45);
        al.add(66);
        System.out.println("al="+al);

        // remove all the elements which are odd numbers
       // al.removeIf( x -> (x%2 !=0) ) ;
        // remove all the elements which are less than 20
        al.removeIf( a->(a<20)  ) ;

        System.out.println("al="+al);






    }

}
