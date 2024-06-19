package StringDemo;

public class OCcurance {

    public static void main(String[] args) {

        String str = "we want to go to toronto";

        int count =0;

        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='o')
                count++;
        }

        System.out.println("occurance of o="+count);
    }
}
