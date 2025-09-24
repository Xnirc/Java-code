public class EmployeeInfo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Aman Yadav";
        emp1.id = 101;
        emp1.salary = 50000;
        emp1.department = " IT";
        emp1.designation = "Software Engineer";
        emp1.displayInfo();

    }

}

class Employee {
    String name;
    int id;
    double salary;
    String department;
    String designation;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
    }

}