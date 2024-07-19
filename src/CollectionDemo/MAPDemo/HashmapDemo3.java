package CollectionDemo.MAPDemo;

import java.util.HashMap;

public class HashmapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        System.out.println(hm.isEmpty());
        hm.put(103,"AMOL");
        hm.put(433,"DIVYA");
        hm.put(413,"xyz");
        hm.put(233,"NEETHA");
        hm.put(567,"KARTHIK");
        hm.put(111,"SNEHA");
        System.out.println(hm.isEmpty());
        System.out.println("hm="+hm);

        System.out.println("size="+hm.size());

       // System.out.println(hm.get(57));

        System.out.println(hm.remove(413));
        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(103));

        System.out.println(hm.containsValue("sdsdsd"));

        hm.clear();

        System.out.println("hm="+hm);




    }
}
