package CollectionDemo.MAPDemo;

import java.util.*;

public class HashmapDemo4 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        System.out.println(hm.isEmpty());
        hm.put(103,"AMOL");
        hm.put(433,"DIVYA");
        hm.put(413,"xyz");
        hm.put(233,"NEETHA");
        hm.put(567,"KARTHIK");
        hm.put(111,"SNEHA");
        hm.put(121,"SNEHA");
        // hm.put(11.1,90);
        System.out.println(hm.isEmpty());
        System.out.println(hm);

        Set key = hm.keySet();
        System.out.println("set="+key);

        Collection values = hm.values();
        System.out.println("Collection="+values);

        Set entrySet = hm.entrySet();
        System.out.println("entrySet="+entrySet);

        Object[] keyArr = key.toArray();

        for (int i=0;i<keyArr.length;i++)
            System.out.println(keyArr[i]);








    }
}
