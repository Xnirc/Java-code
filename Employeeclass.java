public class Employeeclass {

    public static void main(String[] args) {
        Employee e3 = new Employee("John", 101);
        Employee e4 = new Employee("Jane", 102, 50000.0);   
        e3.display();
        e4.display();
    }
}
  class Employee{
    String name;
    int id;
    double salary;
    Employee() {
        System.out.println("Default Constructor");
    }
    Employee(String name,int id) {
        this.name = name;
        this.id = id;

    }
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

}
