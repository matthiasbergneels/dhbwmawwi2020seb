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
        return this.studentId - o.getStudentId();
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
}
