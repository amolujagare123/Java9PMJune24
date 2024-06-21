package ClassesNConstructors;

public class ParamConstructorThis {

    int a;
    double d;
    char c;
    String str; // data members

    ParamConstructorThis() // empty constructor
    {

    }

    ParamConstructorThis(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


      //  ParamConstructor ob = new ParamConstructor(12,34.56,'h',"amol");
        ParamConstructorThis ob = new ParamConstructorThis();
                ob.display();

    }
}
