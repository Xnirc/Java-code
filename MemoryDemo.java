public class MemoryDemo {
    static int SchoolCode = 101;
    int rollNo;
    static void showSchool(){
        System.out.println("School Code: " + SchoolCode);

    }
    void showRollNo(){
        System.out.println("Roll No: " + rollNo);
    }
    public static void main(String[] args) {
        MemoryDemo student1 = new MemoryDemo();
        student1.rollNo = 1;
        MemoryDemo student2 = new MemoryDemo();
        student2.rollNo = 2;
        showSchool();
        student1.showRollNo();
        student2.showRollNo();
        System.out.println("Hijda Prashad Dwedi having Roll no :" + student1.rollNo);
    }
}
