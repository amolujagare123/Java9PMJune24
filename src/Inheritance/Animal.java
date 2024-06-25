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
    int height = 3;
    String color = "white";
    public static void main(String[] args) {

        Dog ob = new Dog();
        System.out.println(ob.height);
        System.out.println(ob.color);
        System.out.println(ob.legCount);
        System.out.println(ob.food);

    }


}
