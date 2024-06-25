package Inheritance;


class MyParent
{
    int salary = 15000;
    String name="AMOL";

    /*MyParent()
    {
        //System.out.println("MyParent Constructor");
    }*/

    MyParent(int a)
    {
        System.out.println("a="+a);
        System.out.println("MyParent Constructor");
    }
    void empWork()
    {
        System.out.println("empWork");
    }

    void sortNames()
    {
        System.out.println("sortNames MyParent");
    }
}

class MyChild extends MyParent
{
    int bonus = 10000;
    int salary = 40000;

    MyChild()
    {
        super(10);
        System.out.println("MyChild Constructor");
    }

    void sortNames()
    {
        System.out.println("sortNames MyChild");
    }
    void programmerWork()
    {
        System.out.println("programmer work");
    }

    void printSalary()
    {
        System.out.println("Salary="+salary);
        System.out.println("Salary="+super.salary);
        sortNames();
        super.sortNames();
    }

}

/*class Demo extends MyChild
{
    int salary = 5000;


}*/


public class TestSuperDemo {
    public static void main(String[] args) {
        MyChild myChild = new MyChild();
      //  myChild.printSalary();

        /*Demo d = new Demo();
        d.printSalary();*/
    }
}
