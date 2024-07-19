package CollectionDemo.MAPDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();
       
        tm.put(103,"AMOL");
        tm.put(433,"DIVYA");
        tm.put(413,"xyz");
        tm.put(233,"NEETHA");
        tm.put(567,"KARTHIK");
        tm.put(111,"SNEHA");
        tm.put(121,"SNEHA");

        System.out.println(tm);

        for(Entry<Integer,String> entry : tm.entrySet() )
        {
            System.out.println("Key="+entry.getKey() +" | value="+entry.getValue());
        }










    }
}
