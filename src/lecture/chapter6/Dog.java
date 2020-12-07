package lecture.chapter6;

public class Dog extends Animal{

    private String breed;

    public Dog(float height, String description, float weight, String breed){
        // Aufruf des Konstruktors "Animal" aus der Super Klasse
        super(height, description, weight);

        this.setBreed(breed);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... ganz viel Fleisch!");
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

    @Override
    public String toString(){
        return super.toString() + "; Rasse: " + getBreed();
    }
}
