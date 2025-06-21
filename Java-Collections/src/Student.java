
import java.util.*;

public class Student {
    public int id;
    public String name;
    public double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}

class Main1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Set<Integer> usedIds = new HashSet<>();
        Stack<Student> undoStack = new Stack<>();

        // Add students while checking for duplicate IDs
        addStudent(students, usedIds, undoStack, 1, "Jack", 3.4);
        addStudent(students, usedIds, undoStack, 2, "John", 3.0);
        addStudent(students, usedIds, undoStack, 3, "Jill", 4.0);
        addStudent(students, usedIds, undoStack, 1, "Jake", 3.8); // Duplicate ID - won't be added

        System.out.println("Current students:");
        printStudents(students);

        // Undo last addition
        undoLastAddition(students, usedIds, undoStack);

        System.out.println("\nAfter undo:");
        printStudents(students);

        // Sort by GPA ascending
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.gpa, s2.gpa);
            }
        });

        System.out.println("\nSorted by GPA (ascending):");
        printStudents(students);

        // Sort by GPA descending
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.gpa, s1.gpa);
            }
        });

        System.out.println("\nSorted by GPA (descending):");
        printStudents(students);
    }

    private static void addStudent(ArrayList<Student> students, Set<Integer> usedIds,
                                   Stack<Student> undoStack, int id, String name, double gpa) {
        if (usedIds.contains(id)) {
            System.out.println("Cannot add student with duplicate ID: " + id);
            return;
        }

        Student student = new Student(id, name, gpa);
        students.add(student);
        usedIds.add(id);
        undoStack.push(student);
        System.out.println("Added: " + student);
    }

    private static void undoLastAddition(ArrayList<Student> students, Set<Integer> usedIds,
                                         Stack<Student> undoStack) {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Student removed = undoStack.pop();
        students.remove(removed);
        usedIds.remove(removed.id);
        System.out.println("Removed: " + removed);
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}