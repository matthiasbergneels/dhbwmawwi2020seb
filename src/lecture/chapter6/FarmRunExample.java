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


        // narrowing Cast --> einschränken der Sichtbarkeit auf Objekte

        Animal animalOne = myBello;
        Animal animalTwo = myTweety;

        myBello.bark();
        myBello.move();

        // animalOne.bark(); --> nicht nutzbar über Animal Referenz
        animalOne.move();
        animalOne.eat();
        animalOne.breath();

        // animalTwo.tweet(); --> nicht nutzbar über Animal Referenz
        animalTwo.move();
        animalTwo.eat();
        animalTwo.breath();

        // widening Cast --> erweitern der Sichtbarkeit auf ein Objekt

        if(animalOne instanceof Dog){
            Dog dogOne = (Dog)animalOne;

            dogOne.bark();
            dogOne.move();

            System.out.println("Rasse: " + dogOne.getBreed());
        }

        if(animalTwo instanceof Dog){
            Dog dogTwo = (Dog)animalTwo;

            dogTwo.bark();
            dogTwo.move();
        }else{
            System.out.println("animalTwo ist KEIN Hund!");
        }


        // Polymorphy

        Animal[] animalBox = new Animal[5];

        // Narrowing Cast von verschiedenen Tieren auf "Animal"
        animalBox[0] = myBello;
        animalBox[1] = myTweety;
        animalBox[2] = new Dog(67, "Hasso", 15, "Mischling");
        animalBox[3] = new Bird(17, "Birdy", 3, true);
        animalBox[4] = new Bird(30, "Pingu", 4, false);

        System.out.println("Bauer läuft durch den Stall und kümmert sich um die Tiere:");
        for(Animal currentAnimal : animalBox){
            currentAnimal.eat();
            currentAnimal.move();
            currentAnimal.breath();

            if(currentAnimal instanceof Dog){
                Dog currentDog = (Dog)currentAnimal;
                currentDog.bark();
            }

            System.out.println(currentAnimal);
        }



    }
}
