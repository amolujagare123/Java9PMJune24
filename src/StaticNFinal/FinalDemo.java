package StaticNFinal;

public class FinalDemo {

    final int speed = 200;

    void change()
    {
      //  speed = 100;
    }

    public static void main(String[] args) {

       FinalDemo ob = new FinalDemo();
        ob.change();
        System.out.println("speed="+ob.speed);

      //  System.out.println(Student.college);
    }

}
