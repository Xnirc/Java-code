public class Employee {
    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.SetEmployessDetails("John Doe", 101, 50000.00);
        emp1.displayInfo();
    }
}
class EmployeeDetails {
    String name;
    int id;
    double salary;
 public void SetEmployessDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: " + salary);
        }
}













