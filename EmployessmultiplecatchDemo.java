import java.util.Scanner;

public class EmployessmultiplecatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the employee id:");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the employee name:");
            String name = sc.nextLine();

            System.out.println("Enter the employee salary:");
            double salary = Double.parseDouble(sc.nextLine());

            System.out.println("\nEmployee details:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format! Please enter numeric values for ID and Salary.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}
