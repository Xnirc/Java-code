public class Constructor {
    public static void main(String[] args) {
     Student s2 = new Student("Adi"); 
     Student s3 = new Student(29);
        s2.display();
        s3.display();
       
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Default Constructor");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
    void display(){
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}
