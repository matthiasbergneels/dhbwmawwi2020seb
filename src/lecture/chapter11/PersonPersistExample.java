package lecture.chapter11;

import java.io.*;

public class PersonPersistExample {

    public static void main(String[] args) {

        File myPersonFile = new File(System.getProperty("user.dir") + File.separator + "Person.dat");

        if(!myPersonFile.exists()){
            try{
                myPersonFile.createNewFile();
            } catch(IOException e){
                System.out.println("Fehler beim Anlegen der Person Datei");
            }
        }


        // Schreiben von serialisierten Objekten
        try(FileOutputStream personFileOutputStream = new FileOutputStream(myPersonFile);
            ObjectOutputStream personObjectOutputStream = new ObjectOutputStream(personFileOutputStream)){

            personObjectOutputStream.writeObject(new Person("Klaus", "Mayer", 35));
            personObjectOutputStream.writeObject(new Person("Gabi", "Michel", 35));
            personObjectOutputStream.writeObject(new Person("Helga", "Fritz", 35));
            personObjectOutputStream.writeObject(new Person("Moni", "Müller", 35));
            personObjectOutputStream.writeObject(new Person("Zeus", "Layer", 35));

        } catch(IOException e){
            System.out.println("Fehler beim Schreiben der Person Datei.");
        }


        // Lesen von Objekten (deserialisieren)
        try(FileInputStream personFileInputStream = new FileInputStream(myPersonFile);
        ObjectInputStream personObjectInputStream = new ObjectInputStream(personFileInputStream)){

            while (true) {
                try{
                    System.out.println(personObjectInputStream.readObject());
                } catch (EOFException e){
                    break;
                }
            }

        } catch (IOException e){
            System.out.println("Fehler beim Lesen der Person Datei.");
        } catch (ClassNotFoundException e){
            System.out.println("Klasse nicht gefunden.");
        }

    }
}
