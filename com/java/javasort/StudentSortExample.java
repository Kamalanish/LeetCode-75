package javasort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortExample{

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 85));
        students.add(new Student(2, "Bob", 75));
        students.add(new Student(3, "Charlie", 85));
        students.add(new Student(4, "David", 95));
        students.add(new Student(5, "Eve", 75));

        Collections.sort(students);

        students.forEach(System.out::println);

    }
}

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }

    @Override
    public int compareTo(Student o) {

        int result = Integer.compare(o.marks, this.marks); //descending by marks
        if (result == 0) {
            return this.name.compareTo(o.name); // If marks are same, compare by name (ascending)
        }
        return result;
    }
}
