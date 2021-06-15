package lecture.chapter9;

public class Student implements Comparable<Student>{

    private int age;
    private String familyName;
    private String name;
    private int studentId;

    public Student(int studentId, String name, String familyName, int age){
        this.setStudentId(studentId);
        this.setName(name);
        this.setFamilyName(familyName);
        this.setAge(age);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.studentId != o.getStudentId()){
            return this.studentId - o.getStudentId();
        }

        if(!this.familyName.equals(o.getFamilyName())){
            return this.familyName.compareTo(o.getFamilyName());
        }

        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", familyName='" + familyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o){
        // alias Check
        if(this == o){
            return true;
        }

        // not null check
        if(o == null){
            return false;
        }

        // typ check --> wäre auch mit instance of möglich
        if(this.getClass() != o.getClass()){
            return false;
        }

        // Feld (Attribut) Vergleich
        Student s = (Student)o;

        if(this.getStudentId() != s.getStudentId()){
            return false;
        }

        if(!this.getFamilyName().equals(s.getFamilyName())){
            return false;
        }

        if(!this.getName().equals(s.getName())){
            return false;
        }

        /* --> entfernen für compareTo Konsistenz
        if(this.getAge() != s.getAge()){
            return false;
        }
        */

        return true;
    }

    @Override
    public int hashCode(){
        return this.getStudentId() ^ this.getFamilyName().hashCode() ^ this.getName().hashCode(); // --> entfernen für compareTo Konsistenz  ^ this.getAge();
    }


    /* --> equals generiert von IntelliJ
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (studentId != student.studentId) return false;
        if (familyName != null ? !familyName.equals(student.familyName) : student.familyName != null) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    // --> hashCode generiert von IntelliJ
    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + studentId;
        return result;
    }

     */
}
