import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
       /* int length = 89;
        int breadth = 12;*/
        int length ;
        int breadth ;
        int area ;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of length :");
        length = sc.nextInt();

        System.out.println("enter the value of breadth :");
        breadth = sc.nextInt();

        area = length * breadth ;

        System.out.println( "Area = " + area);
    }
}
