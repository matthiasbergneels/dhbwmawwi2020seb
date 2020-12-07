package lecture.chapter6;

public class FarmRunExample {

    public static void main(String[] args) {

        // Animal myAnimal = new Animal(50.0f, "Dingsda", 15.0f); --> funktioniert nicht mehr für Abstrakte Klassen
        Dog myBello = new Dog(45.0f, "Bello", 20.0f, "Mischling");
        Bird myTweety = new Bird(5.0f, "Tweety", 0.3f, true);

        //System.out.println("myAnimal - Größe: " + myAnimal.getHeight());
        System.out.println("Bello - Größe: " + myBello.getHeight());
        System.out.println("Bello - Rasse: " + myBello.getBreed());
        System.out.println("Tweety - Größe: " + myTweety.getHeight());
        System.out.println("Tweety - kann fliegen: " + myTweety.canFly());

        /*
        myAnimal.eat();
        myAnimal.breath();
        myAnimal.move();
        // myAnimal.bark(); --> bark ist nicht in Animal definiert
         */


        myBello.eat();
        myBello.breath();
        myBello.move();
        myBello.bark();     // spezialisierte Methode in Dog

        myTweety.eat();
        myTweety.breath();
        myTweety.move();
        myTweety.tweet();   // spezialisierte Methode in Bird


        //System.out.println(myAnimal.toString());
        System.out.println(myBello.toString());
        System.out.println(myTweety.toString());

        System.out.println(myBello);
    }
}
