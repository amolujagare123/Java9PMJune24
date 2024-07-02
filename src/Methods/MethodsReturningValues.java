package Methods;

import ClassesNConstructors.MyClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsReturningValues {
    int a,b;

    int myMethod()
    {
        int c = a + b;
        int x = 25;
        return x ;
    }

    char getLastChar(String myStr)
    {

        // return last character of string
        int l = myStr.length();
        char ch = myStr.charAt(l-1);

        return ch;
    }

    double areaOfCircle(int r)
    {
        double area = 3.14 * r * r;

        return area;
    }

    int[] incrementArrayByOne(int[] arr)
    {

        int[] arrTemp = new int[arr.length];

        for (int i=0;i<arrTemp.length;i++)
        {
            arrTemp[i] = arr[i]+1;
        }

        return arrTemp;

    }

    String reverseString(String temp1)
    {

        String temp2 = "";

        for (int k=temp1.length()-1; k>=0; k--)
        {
            temp2 = temp2 +  temp1.charAt(k);
        }

        return temp2;
    }

    String[][] reverseAllStrings(String[][] stArr)
    {
        String[][] tempStArr = new String[stArr.length][stArr[0].length];
        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
             //   String temp1 = stArr[i][j];
            //    String temp2 = reverseString(temp1);
                String temp2 = reverseString(stArr[i][j]);

              /*  for (int k=temp1.length()-1; k>=0; k--)
                {
                    temp2 = temp2 +  temp1.charAt(k);
                }*/


                tempStArr[i][j] = temp2;
            }
        }
        return tempStArr;
    }

    MyClass getLoadedMyClassObject()
    {
        MyClass obj = new MyClass();

        obj.a = 10;
        obj.d = 23.45;
        obj.c = 'h';
        obj.str = "Selenium";

        return obj;
    }

    // Given date is in String format dd/MM/yyyy
    // convert this into another format dd MMMM yy

    String convertDate(String dateStr) throws ParseException // dd/MM/yyyy
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Date date = sd.parse(dateStr);

        SimpleDateFormat sd2 = new SimpleDateFormat("dd MMMM yy");

        return  sd2.format(date);
    }


    public static void main(String[] args) throws ParseException {

         int y ;
         y = 30 ;

         int x = y ;
         System.out.println(y);

        MethodsReturningValues ob  = new MethodsReturningValues();


        int value = ob.myMethod();

        System.out.println("value="+value);

        System.out.println(ob.myMethod());

        char c = ob.getLastChar("selenium");

        System.out.println("c="+c);

        double areaCircle = ob.areaOfCircle(10);
        System.out.println("areaCircle="+areaCircle);

        int[] demoArray = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0;i<demoArray.length;i++)
            System.out.print(demoArray[i]+"\t");

        System.out.println();

        int[] newArray = ob.incrementArrayByOne(demoArray);

        for (int i=0;i<newArray.length;i++)
            System.out.print(newArray[i]+"\t");

        System.out.println();

        String[][] myArr = {
                {"Arjun", "Bhavna", "Chitra"},
                {"Deepak", "Esha", "Farhan"},
                {"Gauri", "Harsh", "Ishita"},
                {"Jatin", "Kiran", "Lakshmi"}
        };


        String[][] newArr = ob.reverseAllStrings(myArr);

        for (int i=0;i<newArr.length;i++)
        {
            for (int j=0;j<newArr[j].length;j++)
            {
                System.out.print(newArr[i][j]+"\t");
            }
            System.out.println();
        }


        MyClass myClass = ob.getLoadedMyClassObject();
        myClass.display();


        String dateStr = ob.convertDate("12/01/1985");

        System.out.println(dateStr);

    }

}
