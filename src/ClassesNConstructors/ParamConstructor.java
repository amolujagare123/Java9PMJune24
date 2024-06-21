package ClassesNConstructors;

public class ParamConstructor {

    int a;
    double d;
    char c;
    String str; // data members

    ParamConstructor() // empty constructor
    {

    }

    ParamConstructor(int a1,double d1,char c1,String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


       // ParamConstructor ob = new ParamConstructor(12,34.56,'h',"amol");
        ParamConstructor ob = new ParamConstructor();
                ob.display();

    }
}
