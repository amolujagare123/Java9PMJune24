package Inheritance.Polymorphism;

/*final*/ class TVShowroom
{
   /* final*/ public void channels()
    {
        System.out.println("TVShowroom channels");
    }


}

class Samsung extends TVShowroom
{

    /*void channels()
    {
        System.out.println("Samsung channels");
    }*/
}




public class TestOverriding
{

    public static void main(String[] args) {

        TVShowroom tvShowroom = new Samsung();
        tvShowroom.channels();

      /* Samsung samsung = new Samsung();
        tvShowroom.channels();*/

         /* Samsung samsung = new Samsung();
        tvShowroom.channels();*/
    }
}
