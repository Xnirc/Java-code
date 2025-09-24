interface Payable{
    void calculateSalary();

}
interface Trainable{
    void attendTraining(String trainingName);
}
class Employee implements Payable,Trainable{
    private String name;
    private double baseSalary;
    private double bonus;

public Employee(String name,double baseSalary,double bonus){
    this.name=name;
    this.baseSalary=baseSalary;
    this.bonus=bonus;
}

 @Override
public void calculateSalary(){
    double totalSalary=baseSalary+bonus;
    System.out.println("Total Salary of "+name+" is: "+totalSalary);
}


    @Override
    public void attendTraining(String trainingName){
        System.out.println(name+" is attending training: "+trainingName);
    }
}
public class Interface1{
    public static void main(String[] args) {
        Employee emp=new Employee("Alice",50000,5000);
        emp.calculateSalary();
        emp.attendTraining("Leadership Skills");
    }
}


    

