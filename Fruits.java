public class Fruits {
    public static void main(String[] args){
        fruit f1 = new fruit();
        f1.name = "Apple";
        f1.number = 10;
        f1.price = 150.50;
        f1.colour = "Red";
        f1.displayInfo();

        fruit f2 = new fruit();
        f2.name = "Banana";
        f2.number = 20;
        f2.price = 50.00;
        f2.colour = "Yellow";
        f2.displayInfo();
    }
    
}
 class fruit{
    int number;
    double price;
    String name;
    String colour;
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Price: " + price);
        System.out.println("Colour: " + colour);


    }
 }

    
 