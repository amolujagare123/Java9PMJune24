package Arrays;

public class DoubleArrayDemo {
    public static void main(String[] args) {

        double[] d = new double[5];


        d[0] = 23.45;
        d[1] = 45.11;
        d[2] = 11.34;
        d[3] = 21.67;
        d[4] = 90.78;

        System.out.println("length="+d.length);

        for(int i=0;i<d.length;i++)
          System.out.println(d[i]);
    }
}
