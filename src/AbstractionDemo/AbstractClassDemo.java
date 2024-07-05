package AbstractionDemo;

public abstract class AbstractClassDemo {

    void display()
    {
        System.out.println("display");
    }

    abstract  void run();
    abstract  void start();

       /* public static void main(String[] args) {
            AbstractClassDemo ob = new AbstractClassDemo();
        }*/
}

class ChildClass extends AbstractClassDemo
{

    void run() {
        System.out.println("run");
    }

    void start() {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractClassDemo ob = new ChildClass();
        ob.run();
        ob.start();
        ob.display();
    }
}
