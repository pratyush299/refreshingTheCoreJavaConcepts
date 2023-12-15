import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SortingOnBasis> students = new ArrayList<>();
        students.add(new SortingOnBasis("John", 101));
        students.add(new SortingOnBasis("Alice", 102));
        students.add(new SortingOnBasis("Bob", 103));

        // Sorting by name
        Collections.sort(students, Comparator.comparing(SortingOnBasis::getName));
        System.out.println("Sorted by name: " + students);

        // Sorting by roll number
        Collections.sort(students, Comparator.comparingInt(SortingOnBasis::getMarks));
        System.out.println("Sorted by roll number: " + students);

    }
}