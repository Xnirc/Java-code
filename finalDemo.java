public class finalDemo {
    class Calculator{
        public void show(){
            System.out.println("In Calculator:");
        }
        public void add(int a, int b){
            System.out.println(a + b);
        }
    }
    class AdvCalc extends Calculator{
        public void show(){
            System.out.println("In AdvCalc:");
        }
    }
    

    public static void main(String[] args) {
        finalDemo d = new finalDemo();
        finalDemo.AdvCalc obj = d.new AdvCalc();
        obj.show();
        obj.add(5, 8);

    }
}
