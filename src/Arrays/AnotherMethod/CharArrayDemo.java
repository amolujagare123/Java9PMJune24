package Arrays.AnotherMethod;

public class CharArrayDemo {

    public static void main(String[] args) {

        char[] ch = {'a','s','f','g','h'};

       /* for (int i=0; i<ch.length;i++)
            System.out.println(ch[i]);*/

        for(char myChar : ch)
        {
            System.out.println(myChar);
        }
    }
}
