package ExceptionHandling;

public class ArrayExample {

    public static void main(String[] args) {

        int[] a = new int[5];
        try {
            a[0] = 23;
            a[1] = 23;
            a[2] = 23;
            a[3] = 23;
            a[4] = 23;
            a[5] = 23;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

    }
}
