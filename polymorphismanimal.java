public class polymorphismanimal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal object
        Animal myDog = new Dog(); // Dog object
        Animal myCat = new Cat(); // Cat object

        myAnimal.sound(); // Outputs: Animal makes a sound
        myDog.sound();    // Outputs: Dog barks
        myCat.sound();    // Outputs: Cat meows
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
} 
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
