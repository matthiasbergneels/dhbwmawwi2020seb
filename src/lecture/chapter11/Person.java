package lecture.chapter11;

import java.io.Serializable;

public class Person implements Serializable {

    static final long serialVersionUID = 1L;

    private String name;
    private String familyName;
    private transient String fullName;
    private int age;


    public Person(String name, String familyName, int age){
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.setFullName();
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

    public void setFullName(){
        this.fullName = name + " " + familyName;
    }

    public String getFullName(){
        return this.fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // de-serialize life cycle
    private Object readResolve(){
        this.setFullName();
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    // Beispiel(!) Serialisierung und Deserialisierung
    public String serializeString(){
        return this.name + ";" + this.familyName + ";" + this.age;
    }

    public static Person deserializeString(String serializedPerson){
        String[] personElements = serializedPerson.split(";");
        return new Person(personElements[0], personElements[1], Integer.parseInt(personElements[2]));
    }
}
