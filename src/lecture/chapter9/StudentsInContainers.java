package lecture.chapter9;

import java.util.Set;
import java.util.TreeSet;

public class StudentsInContainers {

    public static void main(String[] args) {

        Set<Student> myStudentSet = new TreeSet<>();

        myStudentSet.add(new Student(1234, "Zeus", "Gott", 54));
        myStudentSet.add(new Student(9281, "Gabi", "Mayer", 23));
        myStudentSet.add(new Student(4711, "Dietmar", "Henning", 25));
        myStudentSet.add(new Student(4812, "Colin", "Mayer", 21));
        myStudentSet.add(new Student(4711, "Dietmar", "Henning", 25));
        myStudentSet.add(new Student(4711, "Franz", "Fischer", 28));
        myStudentSet.add(new Student(5567, "Dietmar", "Henning", 25));

        System.out.println("Anzahl Studenten: " + myStudentSet.size());

        for(Student student : myStudentSet){
            System.out.println(student);
        }

    }
}
