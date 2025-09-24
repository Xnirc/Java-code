public class multiplecatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println("Number at idex 5" + numbers[5]); // This will throw ArrayIndexOutOfBoundsException

    }
catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index is out of bounds!");
    }
catch (Exception e) {
        System.out.println("Some other exception occurred.");


}
    }
}
