package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo2 {

    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis = new FileInputStream("D:\\amol1.txt");

        System.out.println("End of the program");



    }
}
