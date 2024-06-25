package Inheritance;

public class Animal2 {

    void eat()
    {
        System.out.println("eat");
    }
}

class Mamal extends  Animal2
{
    void walk()
    {
        System.out.println("walk");
    }
}

class Reptile extends Animal2
{
    void crawl()
    {
        System.out.println("crawl");
    }
}


class Tiger extends Mamal
{
    void roar()
    {
        System.out.println("roar");
    }

    public static void main(String[] args) {

        Animal2 animal = new Animal2();
        animal.eat();

        Mamal mamal = new Mamal();
        mamal.walk();
        mamal.eat();

        Reptile reptile = new Reptile();
        reptile.crawl();
        reptile.eat();

        Tiger tiger = new Tiger();
        tiger.roar();
        tiger.walk();
        tiger.eat();

    }
}