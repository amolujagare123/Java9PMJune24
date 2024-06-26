package Inheritance.Polymorphism;

public class Addition {

    void add()
    {
        int   c = 10 + 20;
        System.out.println(c);
    }

    int add(int a)
    {
        int   c = a + 20;
        System.out.println(c);
        return c;
    }

   /* double add(double a)
    {
        int   c = a + 20;
        System.out.println(c);
        return c;
    }*/
    void add(int a,int b)
    {
        int   c = a + b;
        System.out.println(c);
    }

    void add(double a,double b)
    {
        double   c = a + b;
        System.out.println(c);
    }
    void add(String a,String b)
    {
        String   c = a + b;
        System.out.println(c);
    }
    void add(int a,int b,int z)
    {
        int   c = a + b + z;
        System.out.println(c);
    }

    public static void main(String[] args) {

        Addition ob = new Addition();
        ob.add();
        ob.add(12);
        ob.add(12,34);
        ob.add(12,34,56);
        ob.add(12.45,34.12);
        ob.add("Java","Selenium");

    }
}
