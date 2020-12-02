package lecture.chapter5;

public class StudentRunExample {

    public static void main(String[] args) {

        Student myStudent = new Student();

        // Flüssigkeit trinken
        myStudent.drink(500.0);
        // Alkohol trinken
        myStudent.drink(200.0, 40.0);
        // Flüssigkeit mit Betäubungsmittel trinken
        myStudent.drink(true, 250.0);
        // Flüssigkeit mit Gift trinken
        myStudent.drink(10.0, true);

    }
}
