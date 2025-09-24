public class oops {
    public static void main(String[] args) {
       Pen p1 = new Pen("Blue", 5);
         System.out.println("Colour: " + p1.colour);
         System.out.println("Tip: " + p1.tip);
         
         // Uncommenting the following lines will cause an error
         // because the fields are private and cannot be accessed directly.
         // p1.colour = "red";
         // p1.tip = 10;
         
         // Instead, use the methods to change the properties
    //    p1.colour = "blue";
    //      p1.tip = 5;
         p1.changeColour("red");
         p1.changeTip(10);
    }
    
}
class Pen{
    String colour;
    int tip;
    Pen(String c, int t) {
        colour = c;
        tip = t;
    }
    void changeColour(String newColour) {
        colour = newColour;
    }
    void changeTip(int newTip) {
        tip = newTip;
    }
} 