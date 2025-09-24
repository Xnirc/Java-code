public class Employeepolymorphism {
    public static void main(String[] args) {
        double salary = 50000;
        Employee emp = new Employee();
        System.out.println("Employee Salary: " + emp.calculateSalary(salary));
        Manager mgr = new Manager();
        System.out.println("Manager Salary: " + mgr.calculateSalary(salary));
    }   
}   
public class InnerEmployeepolymorphism {

    public static void main(String[] args) {
        double salary = 50000;
        Employee emp = new Employee();
        System.out.println("Employee Salary: " + emp.calculateSalary(salary));
    }
}

