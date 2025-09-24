public class PolyRunDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 10 and 20: " + calc.sum(10, 20));
        System.out.println("Sum of 10.5 and 20.5: " + calc.sum(10.5f, 20.5f));
        System.out.println("Sum of 10, 20, and 30: " + calc.sum(10, 20, 30));
    }
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    void display(){
        System.out.println("This is a calculator class");
    }
}
