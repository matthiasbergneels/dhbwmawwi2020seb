package excercises.chapter7.clone;

public class CloneMachine {

    public static void main(String[] args) {

        Sheep dolly = new Sheep("Dolly", 3);

        try {
            Sheep dollyClone = dolly.clone();

            System.out.println("Original Schaf: " + dolly.name + ", " + dolly.age);
            System.out.println("Geklontes Schaf: " + dollyClone.name + ", " + dollyClone.age);

            dolly.age = 4;

            System.out.println("Original Schaf: " + dolly.name + ", " + dolly.age);
            System.out.println("Geklontes Schaf: " + dollyClone.name + ", " + dollyClone.age);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
