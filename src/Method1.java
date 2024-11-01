class Dog
{
    void bark()
    {
        System.out.println("Barking....");
    }

    void sleep()
    {
        System.out.println("Sleeping....");
    }
}

class Cat
{
    void meow()
    {
        System.out.println("Meow....");
    }

    void eats()
    {
        System.out.println("Eating....");
    }
}

public class Method1{
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.bark();
        d.sleep();
        c.eats();
        c.meow();
    }
}