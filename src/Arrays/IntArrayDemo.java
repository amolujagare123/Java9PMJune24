package Arrays;

public class IntArrayDemo {
    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 23;
        a[1] = 45;
        a[2] = 11;
        a[3] = 21;
        a[4] = 90;

        System.out.println("length="+a.length);

      /*  for(int i=0;i<a.length;i++)
          System.out.println(a[i]);*/

        for(int b : a)
        {
            System.out.println(b);
        }
    }
}
