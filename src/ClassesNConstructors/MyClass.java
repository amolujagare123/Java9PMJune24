package ClassesNConstructors;

public class MyClass {

    public int a;
    public double d;
    public char c;
    public String str; // data members

    public void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    int i;

    public static void main(String[] args) {
       int i;

        i = 10;

        //System.out.println(i);

        MyClass ob = new MyClass();
        ob.a = 89 ;
        ob.d = 34.67;
        ob.c = 'h';
        ob.str = "text";
        ob.display();
     //   System.out.println(ob);

        MyClass ob2 = new MyClass();
        ob2.a = 90;
        ob2.d = 45.67;
        ob2.c = 'k';
        ob2.str = "text";
        ob2.display();
        //System.out.println(ob2);
    }
}
