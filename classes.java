public class classes{
    public static void main(String[] args) {
         num n1 = new num();
         n1.a = 10;
         n1.b = 20;
            System.out.println("Sum: " + n1.sum());
            System.out.println("Product: " + n1.product());
    }
}
class num {
    int a;
    int b;
    // num(int x, int y) {
    //     a = x;
    //     b = y;
    // }
    int sum() {
        return a + b;
    }
    int product() {
        return a * b;
    }
}
