package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {

    public static void main(String[] args)  {

        try {

            FileInputStream fis = new FileInputStream("D:\\amol1.txt");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        //    e.printStackTrace();
        }
        System.out.println("End of the program");


    }
}
