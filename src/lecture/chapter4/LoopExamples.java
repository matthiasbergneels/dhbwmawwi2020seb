package lecture.chapter4;

public class LoopExamples {

    public static void main(String[] args) {

        int counter;

        System.out.println("Kopfgesteuerte Schleife - while");
        counter = 0;
        while (counter <= 10) {
            if(counter % 2 != 0){
                counter++;
                System.out.println("Ich mag keine ungeraden Zahlen!");
                continue;
            }
            System.out.println(counter);
            counter++;
        }
        System.out.println("Ende der while-Schleife");
        System.out.println("Counter: " + counter);

        System.out.println("Fußgesteuerte Schleife - do-while");
        counter = 0;
        do {
            if(counter == 6){
                System.out.println("Die Zahl des Teufels!!!!!1111elf");
                break;
            }
            System.out.println(counter);
            counter++;
        }while(counter <= 10);

        System.out.println("Ende der do-while-Schleife");
        System.out.println("Counter: " + counter);

        System.out.println("Zähler-Schleife - for");
        // for (Zählervariable initialisieren ; Bedingung ; Änderung der Zählervariable)
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
            //System.out.println(counter);
        }
        System.out.println("Ende der for-Schleife");
        // System.out.println(i); --> i ist nicht außerhalb der Schleife Sichtbar


        // Ugly Coding style
        System.out.println("Zähler-Schleife - for Ugly-Style");
        counter = 0;

        for(;;){
            if(counter > 10){
                break;
            }
            System.out.println(counter);
            counter++;
        }
        System.out.println("Ende der UGLY for-Schleife");


        System.out.println("Durchlaufen von Arrays - for-each-Schleife");
        String[] words = {"Hallo", "Kartoffelwurst", "Auto", "Haus", "Kind", "Baum"};

        System.out.println("For-Schleife über Array:");
        for(int i = 0; i < words.length; i++){
            System.out.println("Index " + i + ": " + words[i]);
            if(words[i] == "Hallo"){
                words[i] = "Tschüss";
            }
        }
        System.out.println("Ende der For-Schleife");


        System.out.println("For-Each-Schleife über Array");
        for(String word: words){
            System.out.println(word);
        }


    }
}
