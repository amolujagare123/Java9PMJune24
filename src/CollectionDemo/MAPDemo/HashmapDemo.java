package CollectionDemo.MAPDemo;

import java.util.HashMap;

public class HashmapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(103,"AMOL");
        hm.put(433,"DIVYA");
        hm.put(433,"xyz");
        hm.put(233,"NEETHA");
        hm.put(null,"KARTHIK");
        hm.put(null,"SNEHA");
        hm.put('j',true);
        hm.put("dsds","SNEHA");
        hm.put(15.5,12);
        hm.put(15.5,null);
        hm.put(15.6,null);
        hm.put(17.5,null);

        System.out.println(hm);
    }
}
