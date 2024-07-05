package AbstractionDemo;

import ClassesNConstructors.MyClass;

public interface AnotherInterface {

    void run();
    void start();

    void display();
}

interface  Interface2
{
    void display();
}

class ChildInterface2 /*extends MyClass*/ implements AnotherInterface,Interface2
{

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        Interface2 i2 = new ChildInterface2();
        i2.display();

        AnotherInterface i1 = new ChildInterface2();
        i1.display();

    }
}
