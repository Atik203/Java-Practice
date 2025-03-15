import java.util.*;

class Student{
    private String name;
    private double grade;
    private int id;

    public Student(String name, double grade, int id){
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public double getGrade(){
        return grade;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public void setId(int id){
        this.id = id;
    }

    public void display(){
        System.out.print("Name: " + name + " Grade: " + grade + " ID: " + id);
    }

}

class StudentNameComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){

        if(s1.getName().compareTo(s2.getName()) > 0){
            return 1;
        }else if(s1.getName().compareTo(s2.getName()) < 0){
            return -1;
        } else {
            return 0;
        }

        // short way
        // return s1.getName().compareTo(s2.getName()); // for ascending order
        // return s2.getName().compareTo(s1.getName()); // for descending order
    }
}

class StudentIdComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){

         if(s1.getId() > s2.getId()){
             return 1;
         }else if(s1.getId() < s2.getId()){
             return -1;
         }else{
             return 0;
         }

         // short way
        // return s1.getId() - s2.getId(); // for ascending order
        // return s2.getId() - s1.getId(); // for descending order

    }
}

class TestStudent{
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList();

        students.add(new Student("Atik", 3.5, 1));
        students.add(new Student("Jane", 3.7, 2));
        students.add(new Student("Karim", 3.9, 3));
        students.add(new Student("Emon", 3.8, 4));
        students.add(new Student("Babul", 3.6, 5));

        students.set(3, new Student("Rahim", 4.0, 4));

        students.remove(4);

        students.sort(new StudentNameComparator());
        System.out.println("Sorted by Name: ");
        for(Student s: students){
            s.display();
            System.out.println();
        }

        students.sort(new StudentIdComparator());
        System.out.println("Sorted by ID: ");
        for(Student s: students){
            s.display();
            System.out.println();
        }

        // or we can use anonymous class to sort by grade like below
        students.sort(new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                return s1.getGrade() > s2.getGrade() ? 1 : -1;

                // ? is a ternary operator
            }
        });

        System.out.println("Sorted by Grade: ");
        for(Student s: students){
            s.display();
            System.out.println();
        }

    }
}