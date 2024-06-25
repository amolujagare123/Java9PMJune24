package Inheritance;

public class Animal {

    String food = "Grass";
  /*private*/ int legCount =4;

  void eat()
  {
      System.out.println("eat");
  }
}

class Dog  extends Animal
{

    void bark()
    {
        System.out.println("bark");
    }

    int height = 3;
    String color = "white";



}

class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("weep");
    }

    public static void main(String[] args) {

       /* Dog ob = new Dog();
        System.out.println(ob.height);
        System.out.println(ob.color);
        System.out.println(ob.legCount);
        System.out.println(ob.food);*/

        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();


    }
}
