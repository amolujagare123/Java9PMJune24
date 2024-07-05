package StaticNFinal;

public class StaticMethodDemo {

    int rno;
    String name;
    public static String college="ITS";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");
      //  System.out.println("rno="+rno); // non static - not allowed
     //   System.out.println("name="+name);// non static - not allowed
        System.out.println("college="+college);// static - allowed
        staticMethod2();// static - allowed
     //   nonStaticMethod1(); // non static - not allowed
     //   display(); // non static - not allowed
     //   nonStaticMethod2(); // non static - not allowed
    }

    public static  void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    void nonStaticMethod1()
    {
        System.out.println("nonStaticMethod1");
    }

     void nonStaticMethod2()
    {
        System.out.println("nonStaticMethod2");

        System.out.println("rno="+rno); // non static - allowed
        System.out.println("name="+name);// non static -  allowed
        System.out.println("college="+college);// static - allowed
        staticMethod2();// static - allowed
        nonStaticMethod1(); // non static -  allowed
        display(); // non static -  allowed
        nonStaticMethod2(); // non static -  allowed
    }

    public static void main(String[] args) {

        StaticMethodDemo ob = new StaticMethodDemo();
        ob.staticMethod1();
        ob.staticMethod2();

        StaticMethodDemo.staticMethod1();
        StaticMethodDemo.staticMethod2();

    }
}
