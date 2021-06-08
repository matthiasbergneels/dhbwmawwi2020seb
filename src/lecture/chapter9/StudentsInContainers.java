package lecture.chapter9;

import java.util.*;

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
        myStudentSet.add(new Student(9281, "Fritz", "Mayer", 23));

        System.out.println("Anzahl Studenten: " + myStudentSet.size());

        System.out.println("My Student Set: ");
        for(Student student : myStudentSet){
            System.out.println(student);
        }


        // Variante 1: Set mit externer Sortierung
        Set<Student> myStudentSetSortedByAge = new TreeSet<>(new StudentSortByAge());

        myStudentSetSortedByAge.addAll(myStudentSet);

        System.out.println("Students by Age:");
        for(Student student : myStudentSetSortedByAge){
            System.out.println(student);
        }

        // Variante 2: Liste die sortiert wird
        List<Student> myStudentListSortedByAge = new ArrayList<>();

        myStudentListSortedByAge.addAll(myStudentSet);

        myStudentListSortedByAge.sort(new StudentSortByAge());

        System.out.println("Students by Age (List):");
        for(Student student : myStudentListSortedByAge){
            System.out.println(student);
        }

        // Sortieren nach der Anzahl der Buchstaben im Nachnamen --> über eine Lambda Funktion
        Comparator<Student> sortStudentsByNumberOfSignsInFamilyName = (Student o1, Student o2)->{
            return o1.getFamilyName().length() - o2.getFamilyName().length();
        };

        myStudentListSortedByAge.sort(sortStudentsByNumberOfSignsInFamilyName);

        System.out.println("Students number of signs in family name (List):");
        for(Student student : myStudentListSortedByAge){
            System.out.println(student);
        }

        // Sortieren nach der Anzahl der Buchstaben im Nachnamen --> über eine Anonyme Innere Klasse
        myStudentListSortedByAge.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFamilyName().length() - o2.getFamilyName().length();
            }
        });

    }
}
