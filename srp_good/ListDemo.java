package srp_good;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ListDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        System.out.println("Method from collection Interface: " + students.isEmpty());
        students.add("John");
        students.add("Jane");
        students.add("Doe");
        System.out.println("Students List: " + students);
        System.out.println("contains 'Jane': " + students.contains("Jane"));
        students.remove("Doe");
        System.out.println("After removing 'Doe': " + students);
        students.set(0, "Johnny");
        System.out.println("After setting index 0 to 'Johnny': " + students);
        System.out.println("Size of students list: " + students.size());
        Iterator<String> iterator = students.iterator();
        System.out.print("Iterating through students: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "Mea ");

    }
}
}
