package ControlStructure;

public class GreaterNumber2 {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        if (a>b)
        {
            System.out.println("a is greater");
            System.out.println("a="+a);
        }
        else if(b>a)
        {
            System.out.println("b is greater");
        }
        else if(b==a)
        {
            System.out.println("a & b are equal");
        }


    }
}
