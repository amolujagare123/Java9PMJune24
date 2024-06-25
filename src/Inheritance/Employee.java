package Inheritance;

public class Employee {
    int salary = 15000;
    String name="AMOL";
    void empWork()
    {
        System.out.println("empWork");
    }
}

class Programmer extends Employee
{
    int bonus = 10000;

    void programmerWork()
    {
        System.out.println("programmer work");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.programmerWork();
        System.out.println("bonus="+p.bonus);

        p.empWork();
        System.out.println(p.name);
        System.out.println(p.salary);

    }
}