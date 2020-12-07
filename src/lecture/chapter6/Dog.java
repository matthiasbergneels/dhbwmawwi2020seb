package lecture.chapter6;

public class Dog extends Animal{

    private String breed;

    public Dog(float height, String description, float weight, String breed){
        // Aufruf des Konstruktors "Animal" aus der Super Klasse
        super(height, description, weight);

        this.setBreed(breed);
    }

    public void bark(){
        System.out.println("Der Hund " + this.getDescription() + " bellt!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
