package ExceptionHandling;

import java.io.FileNotFoundException;

public class NumberDemo {

    void checkNumber(int i) throws FileNotFoundException {
        if (i<=10 && i>=1)
        {
            System.out.println("We are safe");
        }
        else
        {
            throw  new FileNotFoundException("We are in danger");
        }

    }


    public static void main(String[] args) throws FileNotFoundException {

        int a = 12;

        System.out.println("we are checking");

        NumberDemo ob = new NumberDemo();
        ob.checkNumber(a);

        System.out.println("a="+a);
        System.out.println("End of the program");

    }
}
