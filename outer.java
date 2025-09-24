public class outer{
    // Add your class members and methods here
    class inner{
        void greet(){
            System.out.println("Hello from inner class!");
        }
    }
    public static void main(String[] args) {
        outer outerObj= new outer();
outer.inner innerObj= outerObj.new inner();
innerObj.greet();
    }
}