package Arrays.TwoDArrays;

public class TwoDArrayIntDemo {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

        a[0][0] = 12;
        a[0][1] = 13;
        a[0][2] = 14;

        a[1][0] = 45;
        a[1][1] = 47;
        a[1][2] = 48;

        a[2][0] = 66;
        a[2][1] = 77;
        a[2][2] = 88;

        a[3][0] = 10;
        a[3][1] = 30;
        a[3][2] = 50;

        System.out.println("row="+a.length);
        System.out.println("col="+a[0].length);


        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
