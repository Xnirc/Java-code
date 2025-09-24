import java.util.Scanner;
public class Basicofjava {
    public static void main(String[] args) {
        // System.out.println("Area of a Circle");
        // double radius = 5.0;
        // double area = Math.PI * radius * radius;
        // System.out.println("Radius: " + radius);
        // System.out.println("Area: " + area);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        sc.close();     
    }
}