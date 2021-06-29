package lecture.chapter11;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class FileSystemExample {

    public static void main(String[] args) {

        System.out.println("Liste von Laufwerken / root Verzeichnis: ");
        System.out.println("=========================================");
        File[] rootList = File.listRoots();

        for(File root : rootList){
            System.out.println("Pfad: " + root.getPath());
            System.out.println("- existiert: " + root.exists());
            System.out.println("- Lesezugriff: " + root.canRead());
            System.out.println("- Schreibzugriff: " + root.canWrite());
            System.out.println("- ist Verzeichnis: " + root.isDirectory());
        }


        System.out.println("System Properties in Java: ");
        System.out.println("=========================================");
        Properties systemProperties = System.getProperties();

        Set systemPropertiesKeys = systemProperties.keySet();
        for(Object key : systemPropertiesKeys){
            System.out.println(key + ": " + systemProperties.get(key));
        }


        System.out.println("Ausgabe von allen Inhalten aus user.dir: ");
        System.out.println("=========================================");


        File userDir = new File(System.getProperty("user.dir"));

        System.out.println("Name: " + userDir.getName());
        System.out.println("Pfad: " + userDir.getPath());
        System.out.println("Existiert: " + userDir.exists());
        System.out.println("Ist Verzechnis: " + userDir.isDirectory());
        System.out.println("Ist Datei: " + userDir.isFile());
        System.out.println("Berechtigungen:  " + (userDir.canRead() ? "r" : "-") + " / " + (userDir.canWrite() ? "w" : "-"));

        System.out.println("Inhalt von " + userDir.getName() + ":");
        System.out.println("=====================================");
        listDirectoryAndContent(userDir, 0);


        System.out.println("Umgang mit Verzeichnissen und Dateien");
        System.out.println("=====================================");

        File myDirectory = new File(System.getProperty("user.dir") + File.separator + "myDirectory");
        File myRenamedDirectory = new File(System.getProperty("user.dir") + File.separator + "myRenamedDirectory");

        System.out.println("myDirectory existiert? " + myDirectory.exists());

        // Verzeichnis anlegen
        if(!myDirectory.exists()){
            System.out.println("Verzeichnis anlegen");
            myDirectory.mkdir();
            System.out.println("Verzeichnis " + myDirectory.getPath() + " angelegt.");
            System.out.println(myDirectory.getPath() + ": " + myDirectory.exists());
            System.out.println(myRenamedDirectory.getPath() + ": " + myRenamedDirectory.exists());
        }

        // Verzeichnis umbenennen
        if(myDirectory.exists() && !myRenamedDirectory.exists()){
            System.out.println("Verzeichnis umbenennen");
            myDirectory.renameTo(myRenamedDirectory);
            System.out.println(myDirectory.getPath() + ": " + myDirectory.exists());
            System.out.println(myRenamedDirectory.getPath() + ": " + myRenamedDirectory.exists());
        }


        File myFile = new File(myRenamedDirectory.getPath() + File.separator + "myFile.txt");
        File myRenamedFile = new File(myRenamedDirectory.getPath() + File.separator + "myRenamedFile.txt");

        // Datei anlegen
        if(!myFile.exists()){
            System.out.println("Datei anlegen");
            try {
                myFile.createNewFile();
                System.out.println(myFile.getPath() + ": " + myFile.exists());
                System.out.println(myRenamedFile.getPath() + ": " + myRenamedFile.exists());
            }catch (IOException e){
                System.out.println("Datei anlegen hat nicht funktioniert.");
            }
        }

        // Datei umbenennen
        if(myFile.exists() && !myRenamedFile.exists()){
            System.out.println("Datei umbenennen");
            myFile.renameTo(myRenamedFile);
            System.out.println(myFile.getPath() + ": " + myFile.exists());
            System.out.println(myRenamedFile.getPath() + ": " + myRenamedFile.exists());
        }

        // Datei löschen
        if(myRenamedFile.exists()){
            System.out.println("Datei löschen");
            myRenamedFile.delete();
            System.out.println(myFile.getPath() + ": " + myFile.exists());
            System.out.println(myRenamedFile.getPath() + ": " + myRenamedFile.exists());
        }

        // Verzeichnis löschen
        if(myRenamedDirectory.exists()){
            System.out.println("Verzeichnis löschen");
            myRenamedDirectory.delete();
            System.out.println(myDirectory.getPath() + ": " + myDirectory.exists());
            System.out.println(myRenamedDirectory.getPath() + ": " + myRenamedDirectory.exists());
        }


        System.out.println("Einlesen von Daten über System.in (Bytes)");
        System.out.println("=====================================");

        byte[] input = new byte[255];

        System.out.println("Geben Sie einen Text ein: ");

        try{
            System.in.read(input, 0, 15);
        } catch (IOException e){
            System.out.println("Fehler beim einlesen von der Konsole");
        }

        System.out.println(input);
        System.out.println(new String(input) + "!");


        System.out.println("Einlesen von Daten über System.in (Char)");
        System.out.println("=====================================");

        InputStreamReader systemInReader = new InputStreamReader(System.in);
        BufferedReader systemInBufferedReader = new BufferedReader(systemInReader);

        System.out.println("Bitte einen Text eingeben:");

        try {
            String inputText = systemInBufferedReader.readLine();

            System.out.println(inputText);
        } catch (IOException e){
            System.out.println("Fehler beim einlesen von der Konsole");
        }

        System.out.println("Einlesen von Daten über System.in (Scanner based)");
        System.out.println("=====================================");

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> myMessage = new ArrayList<String>();

        System.out.println("Bitte text eingeben (Ende mit exit):");
        while(scanner.hasNext()){
            String messageLine = scanner.nextLine();
            if (messageLine.equals("exit")){
                break;
            }
            myMessage.add(messageLine);
        }

        for(String messageLine : myMessage){
            System.out.println(messageLine);
        }

        File myTextFile = new File(System.getProperty("user.dir") + File.separator + "myTextFile.txt");

        if(!myTextFile.exists()){
            try{
                myTextFile.createNewFile();
            } catch (IOException e){
                System.out.println("Fehler beim Anlegen der Textdatei.");
            }
        }

        FileWriter myTextFileWriter = null;

        try{
            myTextFileWriter = new FileWriter(myTextFile);
            for(String messageLine : myMessage){
                myTextFileWriter.write(messageLine + "\n");
            }
        } catch(IOException e){
            System.out.println("Fehler beim Schreiben in die Textdatei!");
        }finally {
            try {
                myTextFileWriter.close();
            } catch (IOException e){
                System.out.println("Fehler beim Schließen der Textdatei!");
            }
        }


        // auslesen aus Textdatei
        try(FileReader myTextFileReader = new FileReader(myTextFile);
            BufferedReader myTextBufferedReader = new BufferedReader(myTextFileReader)){

            String line;
            while((line = myTextBufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e){
            System.out.println("Datei wurde nicht gefunden!");
        } catch (IOException e){
            System.out.println("Fehler beim lesen der Datei!");
        }


    }


    private static void listDirectoryAndContent(File currentDirectory, int indentation){
        printlnWithIndentation("+" + currentDirectory.getName() +" - "
                + (currentDirectory.canRead() ? "Lesezugriff" : "Kein Lesezugriff") + "; "
                +(currentDirectory.canWrite() ? "Schreibzugriff" : "Kein Schreibzugriff"), indentation );

        File[] currentDirectoryContent = currentDirectory.listFiles();
        for(File currentFile : currentDirectoryContent){
            if(currentFile.isDirectory()){
                listDirectoryAndContent(currentFile, indentation+1);
            }else if(currentFile.isFile()){
                printlnWithIndentation("-" + currentFile.getName()
                        + " - "+ (currentFile.canRead() ? "Lesezugriff" : "Kein Lesezugriff") + "; "
                        +(currentFile.canWrite() ? "Schreibzugriff" : "Kein Schreibzugriff") + "; "
                        + currentFile.length() + " Byte", indentation+1 );
            }
        }

    }

    private static void printlnWithIndentation(String txt, int indentation){
        String indentationText = "";
        for(int i = 0; i < indentation; i++){
            indentationText += "\t";
        }

        System.out.println(indentationText + txt);
    }
}
