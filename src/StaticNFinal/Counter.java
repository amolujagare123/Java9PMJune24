package StaticNFinal;

public class Counter {

    static int count = 0;
  /*  static int college = 0;
    static int a = 0;
*/
    Counter()
    {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
