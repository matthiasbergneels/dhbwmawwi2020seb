package lecture.chapter6;

public class FarmRunExample {

    public static void main(String[] args) {

        Animal myAnimal = new Animal(50.0f, "Dingsda", 15.0f);
        Dog myBello = new Dog(45.0f, "Bello", 20.0f, "Mischling");

        System.out.println("myAnimal - Größe: " + myAnimal.getHeight());
        System.out.println("Bello - Größe: " + myBello.getHeight());
        System.out.println("Bello - Rasse: " + myBello.getBreed());

        myAnimal.eat();
        myAnimal.breath();
        myAnimal.move();
        // myAnimal.bark(); --> bark ist nicht in Animal definiert

        myBello.eat();
        myBello.breath();
        myBello.move();
        myBello.bark();     // spezialisierte Methode in Dog


    }
}
