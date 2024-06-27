package Methods;

import ClassesNConstructors.MyClass;

import java.util.Date;

public class MethodsTakingArguments {


    void display()
    {
        System.out.println("display");
    }
    void areaCircle(int r)
    {
        double area = 3.14 * r * r ;
        System.out.println("area="+area);
    }
    void areaRectangle(int l,int b)
    {
        int area = l * b ;
        System.out.println("area="+area);
    }
    void areaRectangle(int l,double b)
    {
        double area = l * b ;
        System.out.println("area="+area);
    }

    void printLengthString(String str)
    {
        System.out.println("length="+str.length());
    }

    void printDate(Date date)
    {
        System.out.println("Date="+date);
    }

    void printArraySingleD(int[] arr)
    {
        System.out.println("==== Array Below =====");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");

        System.out.println();
    }

    void printTwoDArray(String[][] stArr)
    {
        for (int i=0;i< stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void setMyClassObject(MyClass obj)
    {
        obj.a = 10;
        obj.d = 20.23;
        obj.c ='f';
        obj.str = "Text";
    }

    public static void main(String[] args) {

        MethodsTakingArguments ob = new MethodsTakingArguments();
        ob.display();
        ob.areaCircle(10);
        ob.areaRectangle(12,45);
        ob.areaRectangle(12,45.67);
        ob.printLengthString("amol ujagare");
        ob.printDate(new Date());

        int[] xArr = {12,45,24,36,45,47,89,4,79};

        ob.printArraySingleD(xArr);

        String[][] myArr = {
                {"Arjun", "Bhavna", "Chitra"},
                {"Deepak", "Esha", "Farhan"},
                {"Gauri", "Harsh", "Ishita"},
                {"Jatin", "Kiran", "Lakshmi"}
        };

        ob.printTwoDArray(myArr);



        MyClass myClass = new MyClass();

        ob.setMyClassObject(myClass);

        myClass.display();

    }
}
