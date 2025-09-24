package srp_good;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Use Integer instead of String
        ArrayList<Integer> list = new ArrayList<>();

        // Adding integers
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("ArrayList: " + list);

        // Get element at index 2
        int element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // Remove element at index 2
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        // Set value at index 1
        list.set(1, 20);
        System.out.println("After setting index 1 to 20: " + list);
    }
}
