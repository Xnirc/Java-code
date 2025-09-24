

public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.breath();
        d.swim();
        d.walk();
        d.bark();
        d.legs = 4;
        d.display();

    }
}
class Animal{
    String colour;
    void eats(){
        System.out.println("Animal eats");
    }
    void breath(){
        System.out.println("Animal breathes");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Fish swims");
    }
}
class Mammal extends Fish{
    void walk(){
        System.out.println("Mammal walks");
    }
}
class Dog extends Mammal{
    int legs;
    void bark(){
    System.out.println("Dog has barked ");
}
void display(){
    System.out.println("Dog is a mammal and a fish");
}
}


