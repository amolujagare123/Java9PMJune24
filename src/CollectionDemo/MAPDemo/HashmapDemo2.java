package CollectionDemo.MAPDemo;

import java.util.HashMap;

public class HashmapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(103,"AMOL");
        hm.put(433,"DIVYA");
        hm.put(433,"xyz");
        hm.put(233,"NEETHA");
        hm.put(567,"KARTHIK");
        hm.put(111,"SNEHA");
        System.out.println("hm="+hm);


        HashMap<Integer,String> hm2 = new HashMap<>();
        System.out.println("hm2="+hm2);
        hm2.putAll(hm);
        System.out.println("hm2="+hm2);

    }
}
