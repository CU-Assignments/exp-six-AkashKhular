import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double marks;
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        // List of students
        List<Student> students = Arrays.asList(
            new Student("Alice", 80),
            new Student("Bob", 65),
            new Student("Charlie", 90),
            new Student("David", 70),
            new Student("Eve", 85)
        );
        students.stream()
                .filter(s -> s.getMarks() > 75) 
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .forEach(s -> System.out.println(s.getName()));
    }
}
